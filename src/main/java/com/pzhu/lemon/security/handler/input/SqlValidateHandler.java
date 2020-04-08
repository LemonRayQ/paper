package com.pzhu.lemon.security.handler.input;

import com.pzhu.lemon.security.handler.AbstractHandler;
import com.pzhu.lemon.security.model.UserModel;
import com.pzhu.lemon.security.model.UserParam;
import com.pzhu.lemon.security.service.SqlSecurityService;
import com.pzhu.lemon.security.utils.BaseSecurityException;
import com.pzhu.lemon.security.utils.err.CommonErrorCode;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.regex.Pattern;

/**
 * @Auther: LemonQ
 * @Date: 2020/4/7 14:40
 */
@Component
public class SqlValidateHandler extends AbstractHandler<UserParam, UserModel> {

    //过滤所有特殊字符
    private final static String REG_EX="[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
    @Resource
    private SqlSecurityService sqlSecurityService;

    @Override
    protected UserModel doHandle(UserParam request) {
        return sqlSecurityService.selectByName(request);
    }

    @Override
    protected void preProcessParams(UserParam request) {

        Pattern pattern = Pattern.compile(REG_EX);
        if (StringUtils.isEmpty(request.getUserName())||StringUtils.isEmpty(request.getPassword())){
        //todo 可在这进行正则表达过滤特殊字符
            throw  new BaseSecurityException(CommonErrorCode.ILLEGAL_ARGUMENTS,"账户名或密码为空，请重新输入");
        }
        if (pattern.matcher(request.getUserName()).find() || pattern.matcher(request.getPassword()).find()){
            throw new BaseSecurityException(CommonErrorCode.ILLEGAL_ARGUMENTS,"请输入合法字符");
        }
    }
}
