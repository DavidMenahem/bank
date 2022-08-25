package com.david.bank;

import com.david.bank.config.BankConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class BankApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(BankApplication.class, args);
		BankConfig bankConfig = ctx.getBean(BankConfig.class);
		System.out.println(bankConfig.getName());
		System.out.println(bankConfig.getCode());
		System.out.println(bankConfig.getAddress());
		System.out.println(bankConfig.getTelephone());

	}

}
