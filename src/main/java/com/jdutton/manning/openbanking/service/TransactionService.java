package com.jdutton.manning.openbanking.service;

import java.util.List;

import com.jdutton.manning.openbanking.model.Transaction;

public interface TransactionService {
	
	List<Transaction> findAllByAccountNumber(String acountNumber) throws Exception;

}
