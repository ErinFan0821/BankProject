package com.erinfan.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers = new ArrayList<>();

    public boolean registerCustomer(Customer customer) {
        relateAccountToCustomer(customer,createAccount());
        return addCustomerToBank(customer);
    }

    private boolean addCustomerToBank(Customer customer) {
        if (!isCustomerExisted(customer) && NickNameValidation.isValidNickName(customer.getNickName())) {
            customers.add(customer);
            customer.setIsBankCustomer(true);
            return true;
        }
        return false;
    }


    private void relateAccountToCustomer(Customer customer, Account account){
        customer.setAccount(account);
    }
    
    private Account createAccount() {
        return new Account();
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

    public void depositMoneyForAccount(Account account, int sumOfMoney) {
        account.deposit(sumOfMoney);
    }

    public void withdrawMoneyForAccount(Account account, int sumOfMoney) {
        account.withdraw(sumOfMoney);
    }

}
