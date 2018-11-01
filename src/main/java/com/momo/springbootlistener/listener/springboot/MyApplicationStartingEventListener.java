package com.momo.springbootlistener.listener.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author: MQG
 * @date: 2018/11/1
 */
public class MyApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {
    
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        SpringApplication app = event.getSpringApplication();
        app.setBannerMode(Banner.Mode.OFF);
        System.out.println("=== execute  MyApplicationStartingEventListener ===");
    }
}
