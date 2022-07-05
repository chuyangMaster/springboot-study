package com.xd.service.impl;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    public void doSome(String name){
        System.out.println("service中的业务方法执行了，name" + name);
    }
}
