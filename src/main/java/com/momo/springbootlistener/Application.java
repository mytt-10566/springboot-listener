package com.momo.springbootlistener;

import com.momo.springbootlistener.listener.springboot.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.addListeners(new MyApplicationStartingEventListener(), 
				new MyApplicationEnvironmentPreparedEventListener(), 
				new MyApplicationPreparedEventListener(),
				new MyApplicationReadyEventListener(),
				new MyApplicationFailedEventListener());
		app.run(args);
	}
}
