package com.jdutton.manning.openbanking.controller;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdutton.manning.openbanking.service.TransactionServiceImpl;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

public class TransactionComponentTest {

	
	@BeforeAll
    static void initialiseRestAssuredMockMvcStandalone() {
        RestAssuredMockMvc.standaloneSetup(new TransactionController(new TransactionServiceImpl()));
    }
	
	@Test
	void testApplicationEndToEnd() {
		given()
			.when()
				.get("http://localhost:8080/api/v1/transactions/11111111111111111111")
			.then()
				.assertThat(status().isOk());
	}
}
