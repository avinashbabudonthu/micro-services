package com.microservice2.controller;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice2.rest.clients.Microservice1FeignClient;
import com.netflix.discovery.EurekaClient;

@RestController
public class AppController {

	@Autowired
	private Microservice1FeignClient microservice1FeignClient;

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	@Value("${spring.application.name}")
	private String appName;

	@GetMapping(value = "/greet", produces = TEXT_PLAIN_VALUE)
	public String greeting() {
		String microservice1Response = microservice1FeignClient.hello();
		return String.format("Hello from %s, %s", eurekaClient.getApplication(appName).getName(),
				microservice1Response);
	}
}