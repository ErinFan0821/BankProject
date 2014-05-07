package com.erinfan.bank;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Created by techops on 5/7/14.
 */
public class BankTest {
    Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank();
    }

    @Test
    public void should_add_customer_success() throws Exception {
        Customer expectCustomer = new Customer();
        expectCustomer.setNickName("erinfan");
        expectCustomer.setDateOfBirth("2014-05-04");
        bank.addCustomer(expectCustomer);

        final Customer actualCustomer = bank.getCustomer();
        assertThat(actualCustomer, isA(Customer.class));
        assertThat(actualCustomer.getNickName(), is("erinfan"));
        assertThat(actualCustomer.getDateOfBirth().toString(), is("2014-05-04"));
    }

    @Test
    public void should_add_customer_failed_if_customer_nickname_including_uppercase_letters() throws Exception {
        Customer expectCustomer = new Customer();
        expectCustomer.setNickName("ErinFan");
        expectCustomer.setDateOfBirth("2014-05-04");
        bank.addCustomer(expectCustomer);

        assertNull(bank.getCustomer());
    }
}
