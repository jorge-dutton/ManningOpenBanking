package com.jdutton.manning.openbanking.service;

import java.util.List;

import com.jdutton.manning.openbanking.dto.TransactionDto;

public interface TransactionService {
	
	List<TransactionDto> findAllByAccountNumber(String acountNumber) throws Exception;

}
