package com.erinfan.bank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by techops on 5/7/14.
 */
public class BankTest {
    @Test
    public void should_add_customer_success() throws Exception {
        Bank bank = new Bank();
        final Customer customer = new Customer();
        customer.setNickName("ErinFan");
        customer.setDateOfBirth("5-4-2014");
        bank.addCustomer(customer);
        assertThat(bank.getCustomerNickName(), is("ErinFan"));
        assertThat(bank.getCustomerDateOfBirth().toString(), is("5-4-2014"));
    }


}
