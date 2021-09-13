package com.jdutton.manning.openbanking.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jdutton.manning.openbanking.model.Transaction;
import com.jdutton.manning.openbanking.service.TransactionService;

@SpringBootTest
class TransactionServiceTest {
	
	@Autowired
	private TransactionService transactionService;
	
	@Test
	void findByAccountNumberTest() throws Exception{
		List<Transaction> transactionList = this.transactionService.findAllByAccountNumber(null);
		assertEquals(5, transactionList.size());
	}
}
