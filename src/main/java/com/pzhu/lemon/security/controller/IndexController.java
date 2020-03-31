package com.pzhu.lemon.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: LemonQ
 * @Date: 2020/3/21 18:40
 */
@Controller
public class IndexController  {

    @RequestMapping("/")
    public  String login (){
        System.out.println("11174");
        return "index";
    }
}
