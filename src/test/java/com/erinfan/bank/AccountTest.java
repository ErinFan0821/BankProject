package com.erinfan.bank;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by techops on 5/9/14.
 */
public class AccountTest {

    @Test
    public void should_get_correct_balance_after_several_times_of_deposit() throws Exception {
        Account account = new Account();
        account.deposit(1000);
        assertThat(account.getBalance(), is(1000));
        account.deposit(2000);
        assertThat(account.getBalance(), is(3000));
    }
}
