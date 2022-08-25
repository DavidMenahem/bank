package com.david.balance.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public void setUser(BankUser user) {
        this.user = user;
    }
}
