package com.example.AdvertisementWall.web;

import com.example.AdvertisementWall.pojo.Advertisement;
import com.example.AdvertisementWall.pojo.Register;
import com.example.AdvertisementWall.service.AdvertisementService;
import com.example.AdvertisementWall.service.impl.AdvertisementServiceimpl;
import com.example.AdvertisementWall.service.impl.RegisterServiceimpl;
import com.example.AdvertisementWall.utils.WebUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Book;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Зөндөө
 * @create 2021-06-08 15:42
 */
    public class AdvertisementServlet extends BaseServlet {
    AdvertisementService advertisementServiceimpl = new AdvertisementServiceimpl();
    /*只用来查询用户数量*/
    RegisterServiceimpl registerServiceimpl = new RegisterServiceimpl();

    protected void listAD(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //1 获取请求的参数广告编号
        List<Advertisement> advertisements = advertisementServiceimpl.queryAllAD();
        //2 保存到广告到Request域中
        req.setAttribute("advertisements", advertisements);
        //3 请求转发到此页面
        req.getRequestDispatcher("/page/queryADAll.jsp").forward(req, resp);
    }

    protected void queryOneAD(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //1 获取请求的参数编号
        String serialNumber = req.getParameter("serialNumber");
        //2 表单错误回显
        req.setAttribute("msg", "此广告未找到!");
        req.setAttribute("serialNumber", serialNumber);
        //3 调用Service查询
        Advertisement advertisement = advertisementServiceimpl.queryADoneByserialNumber(serialNumber);
        //4 保存到到Request域中
        req.setAttribute("advertisement", advertisement);
        //5 请求转发到 页面
        req.getRequestDispatcher("/page/queryADBySN.jsp").forward(req, resp);
    }

    protected void queryADByRegister(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //1 获取请求的参数编号
        String id = req.getParameter("id");
        //2 表单错误回显
        req.setAttribute("msg01", "此用户无广告！");
        req.setAttribute("id", id);
        //3 调用Service查询
        List<Advertisement> advertisements = advertisementServiceimpl.queryADById(id);
        //4 保存到到Request域中
        req.setAttribute("advertisements", advertisements);
        //5 请求转发到 页面
        req.getRequestDispatcher("/page/queryADById.jsp").forward(req, resp);
    }

    protected void queryADAndRegisterNum(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Long ADNum = advertisementServiceimpl.queryAllADCount();
        Long RegisterNum = registerServiceimpl.queryRegisterNum();
        req.setAttribute("ADNum", ADNum);
        req.setAttribute("RegisterNum", RegisterNum);
        //5 请求转发到 页面
        req.getRequestDispatcher("/page/dataAD.jsp").forward(req, resp);
    }

    protected void deleteADBySN(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String serialNumber = req.getParameter("serialNumber");
        String id = (String) req.getSession().getAttribute("id");
        serialNumber = id + serialNumber;
        Advertisement advertisementdelete = advertisementServiceimpl.queryADoneByserialNumber(serialNumber);
        if (advertisementdelete != null) {
            advertisementServiceimpl.deleteAdByIdAndserialNumber(advertisementdelete.getId(), serialNumber);
            //5 请求重定向到用户发布广告浏览页面
            resp.sendRedirect(req.getContextPath() + "/manager/advertisementServlet?action=queryADByRegister&id=" + advertisementdelete.getId());
        } else {
            //5 请求重定向到404
            resp.sendRedirect(req.getContextPath() + "/page/page_404.jsp");
        }

    }
}
