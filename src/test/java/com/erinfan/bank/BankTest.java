package com.erinfan.bank;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by techops on 5/7/14.
 */
public class BankTest {
    Bank bank;
    Customer customer;

    @Before
    public void setUp() throws Exception {
        bank = new Bank();
        customer = new Customer();
    }

    @Test
    public void should_add_customer_success() throws Exception {
        customer.setNickName("erinfan");
        customer.setDateOfBirth("2014-05-04");
        bank.addCustomer(customer);

        assertThat(bank.getCustomerNickName(), is("erinfan"));
        assertThat(bank.getCustomerDateOfBirth().toString(), is("2014-05-04"));
    }

    @Test
    public void should_add_customer_failed_if_customer_nickname_including_uppercase_letters() throws Exception {
        customer.setNickName("ErinFan");
        customer.setDateOfBirth("2014-05-04");
        bank.addCustomer(customer);

        assertThat(bank.getCustomerNickName(), is(""));
    }
}
