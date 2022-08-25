package com.david.atm.entities;

import com.david.atm.constants.Action;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Delta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    BankUser user;

    Double delta;

    Action action;

    String description;

    public Long getId() {
        return id;
    }

    public BankUser getUser() {
        return user;
    }

    public Double getDelta() {
        return delta;
    }

    public Action getAction() {
        return action;
    }

    public String getDescription() {
        return description;
    }

    public void setUser(BankUser user) {
        this.user = user;
    }
}
