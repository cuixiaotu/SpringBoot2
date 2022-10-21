package com.xiaotu.boot2.controller;

import com.xiaotu.boot2.bean.Person;
import com.xiaotu.boot2.bean.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping(value = "/")
    public Person hello(){
        return person;
    }
}
