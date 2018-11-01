package com.momo.springbootlistener.listener.springboot;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

/**
 * @author: MQG
 * @date: 2018/11/1
 */
public class MyApplicationEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        ConfigurableEnvironment environment = event.getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
        if (propertySources != null) {
            propertySources.forEach(ps -> {
                System.out.println(ps.getName() + "-----" + ps.getSource() + "-----" + ps.getClass());
            });
        }
        System.out.println("=== execute  MyApplicationEnvironmentPreparedEventListener ===");
    }
}
