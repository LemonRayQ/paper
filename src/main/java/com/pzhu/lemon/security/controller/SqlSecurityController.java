package com.pzhu.lemon.security.controller;

import com.pzhu.lemon.security.handler.input.SqlHandler;

import com.pzhu.lemon.security.handler.input.SqlValidateHandler;
import com.pzhu.lemon.security.model.UserModel;
import com.pzhu.lemon.security.model.UserParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @program: paper
 * @description: sql注入安全控制器
 * @author: LemonQ
 * @create: 2020-03-18 22:17
 **/

@Controller
@RequestMapping("/mysql/")
public class SqlSecurityController {

    @Resource
    private SqlHandler sqlHandler;

    @Resource
    private SqlValidateHandler sqlValidateHandler;

    @RequestMapping(value = "Dlogin")
    @ResponseBody
    public  boolean select (UserParam userParam, HttpServletRequest request){

        System.out.println(userParam);
        UserModel userModel = sqlHandler.handle(userParam);
        if (userModel == null){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }


    @RequestMapping(value = "Tlogin")
    @ResponseBody
    public  boolean selectTrue (UserParam userParam){

        System.out.println(userParam);
        UserModel userModel = sqlValidateHandler.handle(userParam);
        if (userModel == null){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }



}
