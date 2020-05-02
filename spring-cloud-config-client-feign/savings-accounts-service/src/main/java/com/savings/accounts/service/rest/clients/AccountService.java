package com.savings.accounts.service.rest.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.savings.accounts.service.model.AccountList;

@FeignClient(name = "accounts-service", url = "localhost:9000")
public interface AccountService {

	@GetMapping(value = "/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
	public AccountList findAllAccounts();
}