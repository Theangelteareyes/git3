package com.itwjl.controller;

import com.itwjl.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * @program: day01_eeasy_01springMvc
 * @description:
 * @author: Mr.Wang
 * @create: 2019-10-07 13:52
 **/
@Controller
@RequestMapping(path = "/anno")
@SessionAttributes(value = "msg")
public class AnnoContteroller {

    /**
     * 指定传值
     * @param name
     * @return
     */
    @RequestMapping(path = "/testRequestParam")
    public String testRequestParam(@RequestParam(name = "username") String name){
        System.out.println("执行。。！");
        System.out.println(name);
        return "success";
    }

    /**
     * 整体
     * @param body
     * @return
     */
    @RequestMapping(path = "/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行。。！");
        System.out.println(body);
        return "success";
    }

    /**
     * 携带参数testPathVariable注解
     * @param id
     * @return
     */
    @RequestMapping(path = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable("sid") String id){
        System.out.println("执行。。！");
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头
     * @return
     */
    @RequestMapping(path = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header){
        System.out.println("执行。。！");
        System.out.println(header);
        return "success";
    }

    /**
     * 用于获取指定Cookie的值
     * @return
     */
    @RequestMapping(path = "/testCookkieValue")
    public String testCookkieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println("执行。。！");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     *
     * @return
     */
    @RequestMapping(path = "/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("testModelAttribute执行。。！");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void wangModel(String uname, Map<String,User> map){
        System.out.println("wangModel执行了。。");
        //通过用户查询数据库
        User user = new User();
        user.setUname(uname);
        user.setAge("20");
        user.setDate(new Date());
        map.put("abc",user);
    }

    /**
     * 该方法先执行

    @ModelAttribute
    public User wangModel(String uname){
        System.out.println("wangModel执行了。。");
        //通过用户查询数据库
        User user = new User();
        user.setUname(uname);
        user.setAge("20");
        user.setDate(new Date());
        return user;
    }
     */

    /**
     * 存入值
     * @param model
     * @return
     */
    @RequestMapping(path = "/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttributes。。！");
        //底层会存储到request域对象中
        model.addAttribute("msg","梅");
        return "success";
    }

    /**
     * 获取值
     * @param model
     * @return
     */
    @RequestMapping(path = "/getSessionAttributes")
    public String getSessionAttributes(ModelMap model){
        System.out.println("getSessionAttributes。。！");
        String msg = (String) model.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 删除值
     * @return
     */
    @RequestMapping(path = "/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        System.out.println("getSessionAttributes。。！");
        status.setComplete();
        return "success";
    }
}
