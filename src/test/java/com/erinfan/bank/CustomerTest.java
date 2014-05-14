package com.erinfan.bank;

import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by techops on 5/9/14.
 */
public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer();
    }

    @Test
    public void should_add_date_of_birth_success() throws Exception {
        Customer customer = new Customer();
        customer.setDateOfBirth("2014-5-15");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        assertThat(dateFormatter.format(customer.getDateOfBirth()), is("2014-05-15"));
        assertThat(customer.getDateOfBirth(), isA(Date.class));
    }

    @Test
    public void should_get_account_for_the_customer() throws Exception {
        customer.setAccount(new Account());
        assertNotNull(customer.getAccount());
    }

    @Test
    public void should_initialise_joining_date_when_customer_was_added() throws Exception {
        customer.setIsBankCustomer(true);

        assertNotNull(customer.getJoiningDate());
    }
}
