package com.example.AdvertisementWall.web;

import cn.qzh.common.CommonUtils;
import com.example.AdvertisementWall.pojo.Advertisement;
import com.example.AdvertisementWall.service.AdvertisementService;
import com.example.AdvertisementWall.service.impl.AdvertisementServiceimpl;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Зөндөө
 * @create 2021-06-10 20:59
 */
public class UpdateADServlet extends HttpServlet {
    AdvertisementService advertisementService = new AdvertisementServiceimpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        req.setAttribute("sucinfo", "更新成功！");
        String serialNumber = "";
        String content = "";
        String pictureName="";
        String webappRoot = "";
        //创建一个 获取解析器的 对象
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //获取解析器
        ServletFileUpload sfu = new ServletFileUpload(factory);
        //使用解析器去解析request对象 获取到的是form表里的所有内容 有表单项或者文件项
        List<FileItem> fileItems = null;
        try {
            fileItems = sfu.parseRequest(req);
            for (FileItem fileItem : fileItems) {
                //判断是不是表单项（自我了解：表单里就能展示的内容） ， 如果是文件或者其他返回false
                if (fileItem.isFormField()) {
                    //如果是表单里面，并且不是文件的内容，就将他放入对象的属性中 这里我们没有做其他属性所以只有一个图像文件
                    if(fileItem.getFieldName().equals("serialNumber")){
                        // 参数UTF-8.解决乱码问题
                        serialNumber = fileItem.getString("UTF-8");
                    }
                    if(fileItem.getFieldName().equals("content")){
                        // 参数UTF-8.解决乱码问题
                        content = fileItem.getString("UTF-8");
                    }
                } else {
                    //获取这个文件夹的绝对路径 ：给一个文件夹的相对路径帮你获取绝对路径
                    String realPath = this.getClass().getResource("/").getPath().replaceFirst("/", "");
                    realPath = "/"+realPath;
                    //文件编译时生成的文件在target目录下的WEB-INF下面,都是字节码文件,所以要根据其路径找到img路径
                    webappRoot = realPath.replaceAll("WEB-INF/classes/", "static/img/");
                    //搞一个uuid 用于放在图片名称前面 以免图片重复名称
                    String prefix = CommonUtils.uuid();
                    //获取图片的名称 并加上uuid
                    String filename =fileItem.getName();
                    //使用目录绝对路径和文件名创建目标文件
                    File file = new File(webappRoot, prefix+filename);
                    //将文件名存入对应属性中
                    pictureName = prefix+filename;
                    //将文件写出到创建好的文件中，
                    fileItem.write(file);

                }
            }
            String id = (String) req.getSession().getAttribute("id");
            //标识每个用户的广告编号 用户名+编号
            serialNumber = id + serialNumber;
            //得到未更新前对象
            Advertisement advertisementdelete = advertisementService.queryADoneByserialNumber(serialNumber);
            //更新广告
            Advertisement advertisement = new Advertisement(id,content,pictureName,serialNumber);
            advertisementService.updateAdContentById(advertisement);
            //请求重定向到按用户编号查询
            resp.sendRedirect(req.getContextPath()+"/manager/advertisementServlet?action=queryADByRegister&id="+advertisement.getId());
            //将本地对应的图片文件删除
            String filePath = webappRoot+advertisementdelete.getPictureName();
            filePath = filePath.toString();
            java.io.File myDelFile = new java.io.File(filePath);
            myDelFile.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
