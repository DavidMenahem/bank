package com.david.atm.feignclients;

import com.david.atm.entities.Balance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("balance")
public interface BalanceClient {
    @GetMapping("/balance")
    Balance getBalance(@RequestParam long userId);

    @PutMapping("balance")
    Balance updateBalance(Balance balance);
}
