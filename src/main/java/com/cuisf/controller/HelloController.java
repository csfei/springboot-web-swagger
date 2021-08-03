package com.cuisf.controller;

import com.cuisf.pojo.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiOperation("hello 控制类")
public class HelloController {


    @GetMapping(value = "/hello")
    public String hello(){

        return "hello";
    }


    //只有接口中存在返回的对象  就会被swagger 扫描
    @PostMapping("/user")
    public User user(){

        return new User();
    }
}
