package com.erinfan.bank;

import java.util.Date;

/**
 * Created by techops on 5/7/14.
 */
public class Bank {

    private Customer customer;

    public void addCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerNickName() {
        return customer.getNickName();
    }

    public Date getCustomerDateOfBirth() {
        return customer.getDateOfBirth();
    }
}
