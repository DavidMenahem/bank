package com.david.bank.entities;

import com.david.bank.constants.Transaction;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BuyStock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    BankUser user;

    @ManyToOne
    Stock stock;
    
    Transaction transaction;

    //Action action;

    double price;
}
