package com.momo.springbootlistener.listener.spring;

import com.momo.springbootlistener.Application;
import com.momo.springbootlistener.handler.Handler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author: MQG
 * @date: 2018/11/1
 */
@Component
public class MyContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        Map<String, Handler> handlerMap = applicationContext.getBeansOfType(Handler.class);
        handlerMap.forEach((key, value) -> {
            System.out.println(key + " --- " + value.getClass());
        });
        System.out.println("=== execute  MyContextRefreshedEventListener ===");
    }
}
