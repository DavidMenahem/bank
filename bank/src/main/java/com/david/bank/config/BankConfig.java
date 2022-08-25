package com.david.bank.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("bank")
@Configuration
public class BankConfig {
    @Getter
    @Value("${bank.name}")
    private String name;

    @Getter
    @Value("${bank.code}")
    private String code;

    @Getter
    @Value("${bank.address}")
    private String address;

    @Getter
    @Value("${bank.telephone}")
    private String telephone;
}
