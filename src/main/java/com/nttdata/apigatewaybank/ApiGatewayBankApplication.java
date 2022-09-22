package com.nttdata.apigatewaybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayBankApplication.class, args);
	}

}
