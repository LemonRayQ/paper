package com.pzhu.lemon.security.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: LemonQ
 * @Date: 2020/4/5 15:55
 */
@Data
public class UserParam implements Serializable {

    private static final long serialVersionUID = 3333643058984132712L;

    private String userName;

    private String password;

}
