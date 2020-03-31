package com.pzhu.lemon.security.utils;

import com.pzhu.lemon.security.utils.err.ErrorCode;
import lombok.AllArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * @program: paper
 * @description: 基础异常类
 * @author: LemonQ
 * @create: 2020-03-18 22:30
 **/
@AllArgsConstructor
public class BaseSecurityException extends RuntimeException{

    private static final long serialVersionUID = 3385737172889854568L;

    private  String code;

    private String desc;

    public BaseSecurityException(Throwable throwable){super(throwable);}

    public BaseSecurityException(String message){super(message);}

    public BaseSecurityException(String message, Throwable throwable){super(message,throwable);}

    public BaseSecurityException(String code, String message, Throwable throwable){
        super(message);
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public BaseSecurityException(ErrorCode errorCode){

        this.code = errorCode.getCode();
        this.desc = errorCode.getDesc();
    }

    public BaseSecurityException(ErrorCode errorCode,String desc){

        this.code = errorCode.getCode();
        this.desc = StringUtils.isEmpty(desc) ? errorCode.getDesc() : desc;
    }
}
