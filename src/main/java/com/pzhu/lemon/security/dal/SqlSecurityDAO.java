package com.pzhu.lemon.security.dal;

import com.pzhu.lemon.security.model.UserModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @program: paper
 * @description: sql注入安全
 * @author: LemonQ
 * @create: 2020-03-18 20:36
 **/
public interface SqlSecurityDAO {

    int insert(UserModel userModel);

    UserModel select(@Param("userName") String userName,@Param("password") String password);

    UserModel selectByName(@Param("userName") String userName,@Param("password") String password);

    int insertByname(@Param("userName") String userName);

}
