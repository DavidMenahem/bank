package com.david.bank.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
public class Balance {
    Long id;

    @ManyToOne
    BankUser user;
    double balance;

    public Long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}
