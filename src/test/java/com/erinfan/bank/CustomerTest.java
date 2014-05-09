package com.erinfan.bank;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by techops on 5/9/14.
 */
public class CustomerTest {
    @Test
    public void should_get_account_for_the_customer() throws Exception {
        final Customer customer = new Customer();
        customer.setAccount(new Account());
        assertNotNull(customer.getAccount());
    }
}
