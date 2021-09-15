package com.jdutton.manning.openbanking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jdutton.manning.openbanking.dto.TransactionDto;

@SpringBootTest
class TransactionServiceTest {
	
	@Autowired
	private TransactionService transactionService;
	
	@Test
	void findByAccountNumberTest() throws Exception{
		List<TransactionDto> transactionList = this.transactionService.findAllByAccountNumber(null);
		assertEquals(5, transactionList.size());
	}
}
