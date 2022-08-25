package com.david.atm.entities;

import javax.persistence.ManyToOne;

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

        public void setUser(BankUser user) {
            this.user = user;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
}
