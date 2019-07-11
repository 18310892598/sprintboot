package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * mapper 映射对象
 */
    @Repository
    @Mapper
    public interface IUserDao {

        @Select("select * from User where id = #{id}")
    public User selectById(Integer id);}




