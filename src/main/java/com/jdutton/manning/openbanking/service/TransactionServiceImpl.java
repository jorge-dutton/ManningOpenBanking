package com.jdutton.manning.openbanking.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jdutton.manning.openbanking.dto.TransactionDto;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Override
	public List<TransactionDto> findAllByAccountNumber(String acountNumber) throws Exception {
		return this.getMockTransactionList();
	}
	
	private List<TransactionDto> getMockTransactionList() throws Exception {
		List<TransactionDto> transactionsList = new ArrayList<>();
		
		var transaction = new TransactionDto();
		transaction.setAccountNumber("11111111111111111111");
		transaction.setCurrency("EUR");
		transaction.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("13/09/2021"));
		transaction.setAmount(new BigDecimal("100.00"));
		transaction.setMerchantLogo("logo1");
		transaction.setMerchantName("name1");
		transaction.setType("type1");
		
		transactionsList.add(transaction);
		
		var transaction2 = new TransactionDto();
		transaction2.setAccountNumber("11111111111111111111");
		transaction2.setCurrency("EUR");
		transaction2.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2021"));
		transaction2.setAmount(new BigDecimal("78.00"));
		transaction2.setMerchantLogo("logo2");
		transaction2.setMerchantName("name2");
		transaction2.setType("type2");
		transactionsList.add(transaction2);
		
		var transaction3 = new TransactionDto();
		transaction3.setAccountNumber("11111111111111111111");
		transaction3.setCurrency("EUR");
		transaction3.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2021"));
		transaction3.setAmount(new BigDecimal("50.00"));
		transaction3.setMerchantLogo("logo3");
		transaction3.setMerchantName("name3");
		transaction3.setType("type3");
		transactionsList.add(transaction3);
		
		var transaction4 = new TransactionDto();
		transaction4.setAccountNumber("11111111111111111111");
		transaction4.setCurrency("EUR");
		transaction4.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("11/09/2021"));
		transaction4.setAmount(new BigDecimal("63.00"));
		transaction4.setMerchantLogo("logo4");
		transaction4.setMerchantName("name4");
		transaction4.setType("type4");
		transactionsList.add(transaction4);
		
		var transaction5 = new TransactionDto();
		transaction5.setAccountNumber("11111111111111111111");
		transaction5.setCurrency("EUR");
		transaction5.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("10/09/2021"));
		transaction5.setAmount(new BigDecimal("23.00"));
		transaction5.setMerchantLogo("logo5");
		transaction5.setMerchantName("name5");
		transaction5.setType("type5");
		transactionsList.add(transaction5);
		
		return transactionsList;
	}

}
