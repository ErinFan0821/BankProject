package com.erinfan.bank;

import static com.erinfan.bank.Validation.isValidNickName;

/**
 * Created by techops on 5/7/14.
 */
public class Bank {

    private Customer customer;

    public Customer addCustomer(Customer customer) {
        if (isValidNickName(customer.getNickName())) {
            this.customer = customer;
        }
        return null;
    }

    public Customer getCustomer() {
        return customer;
    }
}
