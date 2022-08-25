package com.david.bank.controllers;

import com.david.bank.config.BankConfig;
import com.david.bank.entities.Balance;
import com.david.bank.feignclients.BalanceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
@RequiredArgsConstructor
public class BankController {
    private final BankConfig bankConfig;
    private final BalanceClient balanceClient;

    @GetMapping("/details")
    public String getBankDetails(){
        return String.format(" Name: %s \n Code: %s \n Address: %s \n Telephone %s \n",
                bankConfig.getName(),bankConfig.getCode(),bankConfig.getAddress(),bankConfig.getTelephone());
    }

    @GetMapping("/balance")
    public Balance getBalance(@RequestParam long userId){
        return balanceClient.getBalance(userId);
    }

}
