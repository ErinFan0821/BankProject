package com.erinfan.bank;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by techops on 5/9/14.
 */
public class CustomerTest {
    @Test
    public void should_get_account_for_the_customer() throws Exception {
        Customer customer = new Customer();
        customer.setAccount(new Account());
        assertNotNull(customer.getAccount());
    }

    @Test
    public void should_reflect_account_balance_after_deposit_money() throws Exception {
        Customer customer = new Customer();
        Account account = new Account();
        customer.setAccount(account);

        assertThat(customer.depositMoney(10000), is(10000));
    }

    @Test
    public void should_reflect_0_balance_after_withdraw_all_money() throws Exception {
        Customer customer = new Customer();
        Account account = new Account();
        customer.setAccount(account);

        customer.depositMoney(1000);
        assertThat(customer.withdrawMoney(1000), is(0));
    }

    @Test
    public void should_reflect_correct_balance_after_withdraw_money_from_balance() throws Exception {
        Customer customer = new Customer();
        Account account = new Account();
        customer.setAccount(account);

        customer.depositMoney(2000);
        assertThat(customer.withdrawMoney(1000), is(1000));
    }

    @Test(expected = Exception.class)
    public void should_not_overdraw_money() throws Exception {
        Customer customer = new Customer();
        Account account = new Account();
        customer.setAccount(account);

        customer.depositMoney(1000);
        customer.withdrawMoney(2000);
    }

    @Test
    public void should_initialise_joining_date_when_customer_was_added() throws Exception {
        Customer customer = new Customer();
        customer.setIsBankCustomer(true);

        assertNotNull(customer.getJoiningDate());
    }
}
