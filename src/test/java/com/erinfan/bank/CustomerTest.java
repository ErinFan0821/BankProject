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
}
