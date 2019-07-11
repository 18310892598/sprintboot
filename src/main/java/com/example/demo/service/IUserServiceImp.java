package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.mapper.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userServices")
public class IUserServiceImp implements  IUserService {

    @Autowired
    private IUserDao iUserDao;

    @Override
    public User findById(Integer id) {
     return iUserDao.selectById(id);
    }
}
