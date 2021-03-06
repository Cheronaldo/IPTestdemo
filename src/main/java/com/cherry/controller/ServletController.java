package com.cherry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 页面跳转API层
 * Created by Administrator on 2017/11/08.
 */
@Controller
public class ServletController {

    /**
     * 用户登录跳转
     * @return
     */
    @GetMapping("/login")
    public String userLogin(){
        return "login";
    }

    /**
     * 用户注册跳转
     * @return
     */
    @GetMapping("/register")
    public String userRegister(){
        return "register";
    }

    /**
     * 首页跳转
     * @return
     */
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 首页跳转
     * @return
     */
    @GetMapping("/device")
    public String deviceCheck(){
        return "device";
    }

    /**
     * 首页跳转
     * @return
     */
    @GetMapping("/devList")
    public String devList(){
        return "devList";
    }

}
