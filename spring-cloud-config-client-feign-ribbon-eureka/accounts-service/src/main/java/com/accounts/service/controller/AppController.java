package com.accounts.service.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.service.rest.clients.AccountService;

@RestController
public class AppController {

	@Autowired
	private AccountService accountsService;

	@GetMapping(value = "/feign/accounts", produces = APPLICATION_JSON_VALUE)
	public Map<String, Object> findAllAccounts() {
		return accountsService.findAllAccounts();
	}

	@GetMapping(value = "/test", produces = TEXT_PLAIN_VALUE)
	public String test() {
		return "hello world";
	}
}
