package com.bluersw.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//此类里面的方法都以json格式输出
@RestController
public class HelloWorldController {

    //打开浏览器访问http://localhost:8080/helloworld
    @RequestMapping("/helloworld")
    public String helloworld(){
        return "你好！";
    }
}
