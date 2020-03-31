package com.pzhu.lemon.security.service.impl;

import com.pzhu.lemon.security.dal.SqlSecurityDAO;
import com.pzhu.lemon.security.model.UserModel;
import com.pzhu.lemon.security.service.SqlSecurityService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: paper
 * @description:
 * @author: LemonQ
 * @create: 2020-03-18 22:20
 **/
@Component
public class SqlSecurityServiceImpl implements SqlSecurityService {

    @Resource
    private SqlSecurityDAO sqlSecurityDao;

    @Override
    public int insertUser(UserModel userModel) {

        return sqlSecurityDao.insert(userModel);

    }

    @Override
    public int insert(String request) {
        return sqlSecurityDao.insertByname(request);
    }
}
