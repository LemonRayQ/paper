package com.pzhu.lemon.security.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: paper
 * @description: 用户实体
 * @author: LemonQ
 * @create: 2020-03-18 20:31
 **/
@Data
public class UserModel implements Serializable {

    private static final long serialVersionUID = 6966472684794218361L;

    private int id;

    private String userName;

    private String password;

    private String createAt;

    private String updateAt;
}
