package com.erinfan.bank;

/**
 * Created by techops on 5/9/14.
 */
public class Account {

    private int balance;

    public Account() {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int sumOfMoney) {
        balance += sumOfMoney;
    }

    public void withdraw(int sumOfMoney) {
        balance -= sumOfMoney;
    }
}
