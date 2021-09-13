package com.jdutton.manning.openbanking.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Transaction {
	private String type;
	private Date date;
	private String accountNumber;
	private String currency;
	private BigDecimal amount;
	private String merchantName;
	private String merchantLogo;
}
