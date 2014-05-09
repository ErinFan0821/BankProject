package com.erinfan.bank;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by techops on 5/7/14.
 */
public class BankTest {
    @Test
    public void should_add_customer_success() throws Exception {
        Bank bank = new Bank();

        Customer expectCustomer = new Customer();
        expectCustomer.setNickName("erinfan");
        expectCustomer.setDateOfBirth("2014-05-04");

        assertTrue(bank.addCustomer(expectCustomer));

    }

    @Test
    public void should_add_customer_failed_if_customer_nickname_including_uppercase_letters() throws Exception {
        Bank bank = new Bank();

        Customer expectCustomer = new Customer();
        expectCustomer.setNickName("ErinFan");
        expectCustomer.setDateOfBirth("2014-05-04");

        assertFalse(bank.addCustomer(expectCustomer));
    }

    @Test
    public void should_add_customer_failed_if_customer_has_same_nick_name_with_others() throws Exception {
        Bank bank = new Bank();
        Customer customer1 = new Customer();
        customer1.setNickName("erinfan");
        customer1.setDateOfBirth("1988-5-13");
        Customer customer2 = new Customer();
        customer2.setNickName("erinfan");
        customer2.setDateOfBirth("1990-8-21");

        bank.addCustomer(customer1);
        assertFalse(bank.addCustomer(customer2));
    }
}
