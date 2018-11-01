package com.momo.springbootlistener.listener.springboot;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author: MQG
 * @date: 2018/11/1
 */
public class MyApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {
    
    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        Throwable exception = event.getException();
        System.out.println(exception.getMessage());
        System.out.println("=== execute  MyApplicationFailedEventListener ===");
    }
}
