package com.pzhu.lemon.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: LemonQ
 * @Date: 2020/3/21 18:40
 */
@Controller
public class IndexController  {

    @RequestMapping("/")
    public  String login (){
        return "login";
    }
}
