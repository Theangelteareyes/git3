package com.itwjl.controller;

import com.itwjl.domain.Accout;
import com.itwjl.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @program: day01_eeasy_01springMvc
 * @description:
 * @author: Mr.Wang
 * @create: 2019-10-07 11:41
 **/
@Controller
//@RequestMapping("/param")
public class ParamConteroller {
    /**
     * 请求参数绑定
     * @return
     */
    @RequestMapping(path = "/testParam")
    public String testParam(String username){
        System.out.println("执行了绑定。。。！");
        System.out.println(username);
        return "success";
    }

    /**
     * 封装到实体类中
     * @param accout
     * @return
     */
    @RequestMapping(path = "/saveAccout")
    public String saveAccout(Accout accout){
        System.out.println("执行了绑定。。。！");
        System.out.println(accout);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping(path = "/saveUser")
    public String saveUser(User user){
        System.out.println("执行了绑定。。。！");
        System.out.println(user);
        return "success";
    }

    /**
     * 原生的API
     * @param
     * @return
     */
    @RequestMapping(path = "/testService")
    public String testService(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了绑定。。。！");
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext context = session.getServletContext();
        System.out.println(context);

        System.out.println(response);
        return "success";
    }
}
