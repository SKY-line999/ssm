package com.sky.dao;

import com.sky.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author sky
 * @create 2021-05-29-16:04
 * @describe
 */
public interface UserMapper {

    //根据id查询用户
    User queryUserById(@Param("id") int id);


}
