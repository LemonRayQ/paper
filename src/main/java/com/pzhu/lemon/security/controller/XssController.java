package com.pzhu.lemon.security.controller;

import com.pzhu.lemon.security.model.UserModel;
import com.pzhu.lemon.security.model.UserParam;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: LemonQ
 * @Date: 2020/4/8 14:36
 */
@Component
public class XssController {

    @RequestMapping(value = "xss")
    @ResponseBody
    public  String selectTrue (String textArea){
        return textArea;
    }
}
