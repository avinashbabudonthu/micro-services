package com.savings.accounts.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savings.accounts.service.model.AccountList;
import com.savings.accounts.service.rest.clients.AccountService;

@RestController
public class AppController {

	@Autowired
	private AccountService accountsService;

	@GetMapping(value = "/feign/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
	public AccountList test() {
		return accountsService.findAllAccounts();
	}
}