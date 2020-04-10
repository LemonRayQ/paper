package com.pzhu.lemon.security.controller;

import com.pzhu.lemon.security.model.UserModel;
import com.pzhu.lemon.security.model.UserParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: LemonQ
 * @Date: 2020/4/8 14:36
 */
@Controller
@Slf4j
public class XssController {

    @RequestMapping("/security/xss")
    @ResponseBody
    public  String selectTrue (@RequestParam String xss){
        log.info("【XSS】:{}",xss);
        return xss;
    }

    @RequestMapping(value = "/xssTest")
    public  String xssTest (String strings){

        System.out.println(strings);
        return "xss";
    }

}
