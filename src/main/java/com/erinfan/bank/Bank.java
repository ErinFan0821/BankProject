package com.erinfan.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers = new ArrayList<>();

    public boolean addCustomer(Customer customer) {
        if (!isCustomerExisted(customer) && Validation.isValidNickName(customer.getNickName())) {
            customer.setAccount(new Account());
            customers.add(customer);
            customer.setIsBankCustomer(true);
            return true;
        }
        return false;
    }

    List<Customer> getCustomers() {
        return customers;
    }

    private boolean isCustomerExisted(Customer newCustomer) {
        for (Customer customer : customers) {
            if (newCustomer.getNickName().equals(customer.getNickName())) {
                return true;
            }
        }
        return false;
    }

    public int depositMoneyForCustomer(Customer customer, int sumOfMoney) {
        customer.getAccount().deposit(sumOfMoney);
        return getCustomerAccountBalance(customer);
    }

    public int withDrawMoneyForCustomer(Customer customer, int sumOfMoney) {
        customer.getAccount().withdraw(sumOfMoney);
        return getCustomerAccountBalance(customer);
    }

    private int getCustomerAccountBalance(Customer customer) {
        return customer.getAccount().getBalance();
    }
}
