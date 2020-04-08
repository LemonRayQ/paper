package com.pzhu.lemon.security.service;

import com.pzhu.lemon.security.model.UserModel;
import com.pzhu.lemon.security.model.UserParam;

/**
 * @program: paper
 * @description: 数据输入j接口
 * @author: LemonQ
 * @create: 2020-03-18 22:18
 **/

public interface SqlSecurityService {

    int insertUser(UserModel userModel);

    /**
     * sql注入查询
     * @param userParam
     * @return
     */
    UserModel select(UserParam userParam);

    /**
     * 防止sql注入
     * @param userParam
     * @return
     */
    UserModel selectByName(UserParam userParam);


    int insert(String request);
}
