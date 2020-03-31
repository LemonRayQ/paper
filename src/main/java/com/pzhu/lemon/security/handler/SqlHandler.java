package com.pzhu.lemon.security.handler;

import com.pzhu.lemon.security.model.UserModel;
import com.pzhu.lemon.security.service.SqlSecurityService;
import com.pzhu.lemon.security.utils.BaseSecurityException;
import com.pzhu.lemon.security.utils.err.CommonErrorCode;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @program: paper
 * @description: sql注入处理器
 * @author: LemonQ
 * @create: 2020-03-17 20:56
 **/
@Component
public class SqlHandler extends AbstractHandler<String,Integer> {

    @Resource
    private SqlSecurityService sqlSecurityService;

    @Override
    protected void preProcessParams(String request) {
        System.out.println(request);
        if (StringUtils.isEmpty(request)){
            throw  new BaseSecurityException(CommonErrorCode.ILLEGAL_ARGUMENTS,"账户名或密码为空，请重新输入");
        }
    }

    @Override
    protected Integer doHandle(String request) {
        return sqlSecurityService.insert(request);
    }


}
