package com.erinfan.bank;

import java.util.ArrayList;
import java.util.List;

import static com.erinfan.bank.Validation.isValidNickName;

/**
 * Created by techops on 5/7/14.
 */
public class Bank {

    List<Customer> customers = new ArrayList<>();

    public boolean addCustomer(Customer customer) {
        if (isValidNickName(customer.getNickName(), customers)) {
            customers.add(customer);
            customer.setIsBankCustomer(true);
            return true;
        }
        return false;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
