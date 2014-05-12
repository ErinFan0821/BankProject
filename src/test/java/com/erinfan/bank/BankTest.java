package com.erinfan.bank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by techops on 5/7/14.
 */
public class BankTest {

    public static final String VALID_NICK_NAME = "erinfan";

    @Test
    public void should_add_customer_success() throws Exception {
        Bank bank = new Bank();

        Customer expectCustomer = new Customer();
        expectCustomer.setNickName(VALID_NICK_NAME);

        assertTrue(bank.addCustomer(expectCustomer));
    }

    @Test
    public void should_add_customer_failed_if_customer_has_same_nick_name_with_others() throws Exception {
        Bank bank = new Bank();
        Customer customer1 = new Customer();
        customer1.setNickName(VALID_NICK_NAME);
        Customer customer2 = new Customer();
        customer2.setNickName(VALID_NICK_NAME);

        bank.addCustomer(customer1);
        assertFalse(bank.addCustomer(customer2));
    }

    @Test
    public void should_add_join_date_to_added_customer() throws Exception {
        Bank bank = new Bank();
        Customer customer = new Customer();
        customer.setNickName(VALID_NICK_NAME);

        bank.addCustomer(customer);
        assertNotNull(bank.getCustomers().get(0).getJoiningDate());
    }

}
