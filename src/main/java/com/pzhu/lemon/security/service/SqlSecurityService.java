package com.pzhu.lemon.security.service;

import com.pzhu.lemon.security.model.UserModel;

/**
 * @program: paper
 * @description: 数据输入j接口
 * @author: LemonQ
 * @create: 2020-03-18 22:18
 **/

public interface SqlSecurityService {

    int insertUser(UserModel userModel);

    int insert(String request);
}
