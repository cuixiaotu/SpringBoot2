package com.xiaotu.boot2.controller;

import com.xiaotu.boot2.service.UserService;
import com.xiaotu.boot2.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyController {

    @RequestMapping(value = "/proxy")
    public String testProxy() {
        UserService service = new UserServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(service);
        UserService proxy = (UserService) handler.getProxy();
        proxy.add();
        return null;
    }
}


