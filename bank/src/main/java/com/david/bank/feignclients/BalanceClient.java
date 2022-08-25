package com.david.bank.feignclients;

import com.david.bank.entities.Balance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("balance")
public interface BalanceClient {
    @GetMapping("/balance")
    Balance getBalance(@RequestParam long userId);
}
