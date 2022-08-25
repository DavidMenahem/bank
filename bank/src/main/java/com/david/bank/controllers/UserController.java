package com.david.bank.controllers;

import com.david.bank.config.BankConfig;
import com.david.bank.entities.BankUser;
import com.david.bank.exceptions.ApplicationException;
import com.david.bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public BankUser create(@RequestBody BankUser user){
       return userService.create(user);
    }

    @PutMapping
    public BankUser update(@RequestBody BankUser user){
        return userService.update(user);
    }

    @GetMapping("{id}")
    public BankUser get(@PathVariable long id) throws ApplicationException {
        return userService.get(id);
    }
}
