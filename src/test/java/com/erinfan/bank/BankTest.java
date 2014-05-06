package com.erinfan.bank;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by techops on 5/7/14.
 */
public class BankTest {
    @Test
    public void should_add_customer_success() throws Exception {
        Bank bank = new Bank();
        final Customer customer = new Customer();
        customer.setNickName("ErinFan");
        bank.addCustomer(customer);
        assertThat(bank.getCustomerNickName(), is("ErinFan"));
    }
}
