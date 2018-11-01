package com.momo.springbootlistener.handler;

import org.springframework.stereotype.Service;

/**
 * @author: MQG
 * @date: 2018/11/1
 */
@Service
public class UserHandler implements Handler {
    
    @Override
    public void handle() {
        System.out.println("handle user");
    }
}
