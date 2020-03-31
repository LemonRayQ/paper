package com.pzhu.lemon.security.utils.err;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Auther: LemonQ
 * @Date: 2020/3/18 22:56
 */
@AllArgsConstructor
public enum BaseSecurityErrorCode implements ErrorCode {
    ;

    @Getter
    private String code;

    @Getter
    private  String desc;
}
