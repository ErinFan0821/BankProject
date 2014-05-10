package com.erinfan.bank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by techops on 5/7/14.
 */
public class BankTest {

    public static final String VALID_NICK_NAME = "erinfan";
    public static final String INVALID_NICK_NAME = "ErinFan";
    public static final String DATE_OF_BIRTH1 = "2014-05-04";
    public static final String DATE_OF_BIRTH2 = "1990-8-21";

    @Test
    public void should_add_customer_success() throws Exception {
        Bank bank = new Bank();

        Customer expectCustomer = new Customer();
        expectCustomer.setNickName(VALID_NICK_NAME);
        expectCustomer.setDateOfBirth(DATE_OF_BIRTH1);

        assertTrue(bank.addCustomer(expectCustomer));
        Customer actualCustomer = bank.getCustomers().get(0);
        assertThat(actualCustomer.getDateOfBirth().toString(), is(DATE_OF_BIRTH1));
        assertThat(actualCustomer.getNickName().toString(), is(VALID_NICK_NAME));
    }

    @Test
    public void should_add_customer_failed_if_customer_nickname_including_uppercase_letters() throws Exception {
        Bank bank = new Bank();

        Customer expectCustomer = new Customer();
        expectCustomer.setNickName(INVALID_NICK_NAME);
        expectCustomer.setDateOfBirth(DATE_OF_BIRTH1);

        assertFalse(bank.addCustomer(expectCustomer));
    }

    @Test
    public void should_add_customer_failed_if_customer_has_same_nick_name_with_others() throws Exception {
        Bank bank = new Bank();
        Customer customer1 = new Customer();
        customer1.setNickName(VALID_NICK_NAME);
        customer1.setDateOfBirth(DATE_OF_BIRTH1);
        Customer customer2 = new Customer();
        customer2.setNickName(VALID_NICK_NAME);
        customer2.setDateOfBirth(DATE_OF_BIRTH2);

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
