package com.david.balance.controllers;

import com.david.balance.exceptions.ApplicationException;
import com.david.balance.entities.Balance;
import com.david.balance.service.BalanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/balance")
public class BalanceController {

    private final BalanceService balanceService;

    @PostMapping
    public Balance create(@RequestBody Balance balance,@RequestParam long userId){
        return balanceService.create(balance,userId);
    }

    @PutMapping
    public Balance update(@RequestBody Balance balance){
        return balanceService.update(balance);
    }

    @GetMapping
    public Balance get(long userId) throws ApplicationException {
        return balanceService.get(userId);
    }
}
