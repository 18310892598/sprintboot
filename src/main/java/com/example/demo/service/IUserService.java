package com.example.demo.service;


import com.example.demo.bean.User;

/**
 * 定义用户接口
 */
public interface IUserService {

    User findById(Integer id);
}
