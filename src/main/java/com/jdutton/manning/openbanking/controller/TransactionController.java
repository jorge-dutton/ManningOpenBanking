package com.jdutton.manning.openbanking.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdutton.manning.openbanking.dto.TransactionDto;
import com.jdutton.manning.openbanking.service.TransactionService;

@RestController
@RequestMapping("/api/v1")
public class TransactionController {
	
	private TransactionService transactionService;
	
	public TransactionController(TransactionService transactionService) {
		super();
		this.transactionService = transactionService;
	}

	@GetMapping
	@RequestMapping("/transactions/{accountNumber}")
	public List<TransactionDto> getTransactionByAccountNumber(@PathParam("accountNumber") String accountNumber) throws Exception {
		return this.transactionService.findAllByAccountNumber(accountNumber);
	}
}
