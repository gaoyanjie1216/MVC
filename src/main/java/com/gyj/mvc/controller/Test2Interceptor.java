package com.gyj.mvc.controller;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器的类还可以通过实现WebRequestInterceptor接口来编写。弊端：preHandle方法没有返回值，不能终止请求
 * Created by Gao on 2018/3/15.
 */
public class Test2Interceptor implements HandlerInterceptor {

    /*public void preHandle(WebRequest request) throws Exception {

    }

    public void postHandle(WebRequest request, ModelMap model) throws Exception {

    }

    public void afterCompletion(WebRequest request, Exception ex) throws Exception {

    }*/

    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {
        System.out.println("执行到了afterCompletion2方法");
    }

    /**
     * ModelAndView arg3可以通过此参数来改变显示的视图，或修改发往视图的方法
     */
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {
        System.out.println("执行到了postHandle2方法");
        /*arg3.addObject("msg", "这里传回的是被拦截器修改之后的消息:"+arg2);
        arg3.setViewName("/hello2");*/
    }

    /**
     * 返回值：标识我们是否需要将当前的请求拦截下来
     * 如果返回false,请求将被终止, 如果返回true,请求会被继续进行
     * HttpServletRequest存储所有请求的内容，HttpServletResponse存储所有响应的内容
     * Object arg2 表示的是被拦截的请求的目标对象
     */
    /*public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
        System.out.println("preHandle");
        //乱码
        arg0.setCharacterEncoding("utf-8");
        //权限验证
        if (arg1 == null) {
            arg0.getRequestDispatcher(arg0.getContextPath() + "/login.jsp").forward(arg0, arg1);
            System.out.println(arg0.getSession().getAttribute("name"));
            return false;
        }
        return true;
    }*/
    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
        //实现编码处理，使用拦截器解决乱码问题，例如中文乱码等，这样可以不用在xml中配置filter过滤器
        //arg0.setCharacterEncoding("utf-8");
        System.out.println("执行到了preHandle2方法");

        //对用户是否登录进行登录
        /*if (arg0.getSession().getAttribute("user") == null) {
            //用户没有登录，就终止请求，并发送到登录页面
            System.out.println("用户没有登录，就终止请求");
            arg0.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(arg0, arg1);

            return false;
        }*/

        return true;
    }


}
