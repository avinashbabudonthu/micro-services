package com.accounts.service.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.service.model.AccountList;

@RestController
public class AppController {

	@Autowired
	private AccountList accountList;

	@GetMapping(value = "/accounts", produces = APPLICATION_JSON_VALUE)
	public AccountList findAllAccounts() {
		return accountList;
	}
}
