package com.jdutton.manning.openbanking.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class TransactionDto {
	private String type;
	private Date date;
	private String accountNumber;
	private String currency;
	private BigDecimal amount;
	private String merchantName;
	private String merchantLogo;
}
