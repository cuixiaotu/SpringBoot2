package com.xiaotu.boot.controller;

import com.xiaotu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    Car car;

    @RequestMapping(value = "/car")
    public Car getCar(){
        return car;
    }

    @RequestMapping(value = "/hello")
    public String handle() {
        return "Hello, Spring Boot 2";
    }

}
