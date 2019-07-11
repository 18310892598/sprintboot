package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.IUserService;
import com.example.demo.service.IUserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {

    @Autowired
    IUserServiceImp userServices;

    @RequestMapping("/test/{id}")
    @ResponseBody
    public User test(@PathVariable Integer id){
        return userServices.findById(id);
    }
}
