package com.pzhu.lemon.security.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pzhu.lemon.security.handler.SqlHandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping(value = "UserModel", method = RequestMethod.GET)
    public  String insert (@RequestParam String username){
        IService
         sqlHandler.handle(username);
         return "index";
    }


}
