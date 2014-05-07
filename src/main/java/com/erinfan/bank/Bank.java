package com.erinfan.bank;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by techops on 5/7/14.
 */
public class Bank {

    private Customer customer = new Customer();

    public Customer addCustomer(Customer customer) {
        if (isValidNickName(customer.getNickName()) ) {
            this.customer = customer;
        }
        return customer;
    }

    private boolean isValidNickName(String nickName) {
        Pattern pattern = Pattern.compile("[a-z0-9]");
        Matcher m = pattern.matcher(nickName);
        return m.matches();
    }

    public String getCustomerNickName() {
        return customer.getNickName();
    }

    public Date getCustomerDateOfBirth() {
        return customer.getDateOfBirth();
    }
}
