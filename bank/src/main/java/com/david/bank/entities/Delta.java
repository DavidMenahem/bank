package com.david.bank.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Delta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    BankUser user;
    double delta;

    String description;

    public Long getId() {
        return id;
    }

    public double getDelta() {
        return delta;
    }

    public String getDescription() {
        return description;
    }
}
