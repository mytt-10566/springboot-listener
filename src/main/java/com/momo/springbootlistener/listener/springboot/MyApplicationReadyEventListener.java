package com.momo.springbootlistener.listener.springboot;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @author: MQG
 * @date: 2018/11/1
 */
public class MyApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {
    
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        ConfigurableApplicationContext ac = event.getApplicationContext();
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(beanName -> {
            System.out.println(beanName + " \t--- " + ac.getBean(beanName));
        });
        System.out.println("=== execute  MyApplicationReadyEventListener ===");
    }
}
