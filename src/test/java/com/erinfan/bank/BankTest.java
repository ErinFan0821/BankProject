package com.erinfan.bank;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class BankTest {

    public static final String VALID_NICK_NAME = "erinfan";

    @Test
    public void should_add_customer_success() throws Exception {
        Bank bank = new Bank();

        Customer expectCustomer = new Customer();
        expectCustomer.setNickName(VALID_NICK_NAME);

        assertTrue(bank.registerCustomer(expectCustomer));
    }

    @Test
    public void should_add_customer_failed_if_customer_has_same_nick_name_with_others() throws Exception {
        Bank bank = new Bank();
        Customer customer = new Customer();
        customer.setNickName(VALID_NICK_NAME);
        Customer customerExit = new Customer();
        customerExit.setNickName(VALID_NICK_NAME);

        bank.registerCustomer(customer);
        assertFalse(bank.registerCustomer(customerExit));
    }

    @Test
    public void should_add_join_date_to_added_customer() throws Exception {
        Bank bank = new Bank();
        Customer customer = new Customer();
        customer.setNickName(VALID_NICK_NAME);

        bank.registerCustomer(customer);
        assertNotNull(bank.getCustomers().get(0).getJoiningDate());
    }

    @Test
    public void should_deposit_money_success() throws Exception {
        Bank bank = new Bank();

        Customer customer = new Customer();
        customer.setNickName(VALID_NICK_NAME);

        bank.registerCustomer(customer);

        bank.depositMoneyForAccount(customer.getAccount(), 1000);
        assertThat(customer.getAccount().getBalance(), is(1000));
    }

    @Test
    public void should_withdraw_money_success_for_customer() throws Exception {
        Bank bank = new Bank();
        Customer customer = new Customer();
        customer.setNickName(VALID_NICK_NAME);

        bank.registerCustomer(customer);
        Account account = customer.getAccount();
        bank.depositMoneyForAccount(account, 10000);
        bank.withdrawMoneyForAccount(account, 2000);
        assertThat(account.getBalance(), is(8000));
    }
}
