package com.jdutton.manning.openbanking.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.jdutton.manning.openbanking.ManningOpenBankingApplication;
import com.jdutton.manning.openbanking.service.TransactionService;

@AutoConfigureMockMvc
@ContextConfiguration(classes = { ManningOpenBankingApplication.class })
@WebMvcTest
class TransactionControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TransactionService transactionService;

	@Test
	void getTransactionsTes() throws Exception {

		mockMvc
		.perform(get("/api/v1/transactions/11111111111111111111"))
		.andExpect(status().isOk());
	}

}
