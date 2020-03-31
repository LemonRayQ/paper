package com.pzhu.lemon.security.utils.err;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Auther: LemonQ
 * @Date: 2020/3/18 22:52
 */
@AllArgsConstructor
public enum  CommonErrorCode  implements ErrorCode{

    SUCCESS("200", "处理成功"),

    ILLEGAL_ARGUMENTS("400","非法参数"),

    SYSTEM_ERROR("500","系统错误，请稍后重试")

    ;

    @Getter
    private String code;

    @Getter
    private String desc;

}
