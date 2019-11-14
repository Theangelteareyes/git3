package com.itwjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: day01_eeasy_01springMvc
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-24 16:51
 **/
@Controller
public class Helloconteroller {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello springMvc");
        return "success";
    }
}
