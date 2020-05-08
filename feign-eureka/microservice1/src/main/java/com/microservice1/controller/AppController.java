package com.microservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@RestController
public class AppController {

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	@Value("{spring.application.name}")
	private String appName;

	public String hello() {
		return String.format("Hello from %s", eurekaClient.getApplication(appName).getName());
	}
}
