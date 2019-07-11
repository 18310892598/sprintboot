package com.example.demo.login;

import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SpringBootTest {
    /**
     * 获取用户登陆信息
     */
    @RequestMapping("/login")
    public String getLoginUserInfo(){
        System.out.println("login success");
        return "index";
    }

     /**
      * 获取登陆用户token
      */
     @RequestMapping("/getToken")
    public void getToken(){

    }
}
