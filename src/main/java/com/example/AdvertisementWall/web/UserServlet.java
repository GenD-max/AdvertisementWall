package com.example.AdvertisementWall.web;

import com.example.AdvertisementWall.pojo.Register;
import com.example.AdvertisementWall.service.RegisterService;
import com.example.AdvertisementWall.service.impl.RegisterServiceimpl;
import com.example.AdvertisementWall.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Зөндөө
 * @create 2021-06-07 21:04
 */
public class UserServlet extends BaseServlet {
    /*创建service对象*/

    RegisterService registerService = new RegisterServiceimpl();
    /*登录方法*/
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        String password = req.getParameter("password");
        Register register = registerService.login(new Register(id,password));
        if(register == null){
            //把错误信息，和回显的表单项信息，保存到request域中
            //浏览器是老外的 所以他们不支持中文 所以 尽量使用中文
            req.setAttribute("msg","用户名或密码不正确!");
            req.setAttribute("id",id);
            //跳回登陆页面
            req.getRequestDispatcher("index.jsp").forward(req,resp);

        }else{
            req.getSession().setAttribute("id",id);
            //登录成功，转到主页面
            req.getRequestDispatcher("/page/AdvertiseWall.jsp").forward(req, resp);
//            resp.sendRedirect(req.getContextPath()+"/page/AdvertiseWall.jsp");
        }
    }
    /*注册方法*/
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        String password = req.getParameter("password");
        /*直接使用webutils进行封装*/
        Register register = WebUtils.copyParamToBean(req.getParameterMap(), new Register());
        //检查用户名是否已经存在
        if(registerService.existsId(id)){

            req.setAttribute("msgr","该用户已经被注册！");
            System.out.println("用户名[" + id + "]已存在!");
            //跳回注册页面
            req.getRequestDispatcher("/page/register.jsp").forward(req,resp);
        }else {
            registerService.registRegister(new Register(id,password));
            //注册成功跳转登陆页面
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
        }
    }

    /*登出方法*/
    protected void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //销毁session
        req.getSession().invalidate();
        //请求重定向到index.jsp
        resp.sendRedirect(req.getContextPath());
    }
}
