package com.erinfan.bank;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by techops on 5/9/14.
 */
public class AccountTest {

    private static final int ONE_THOUSAND_MONEY = 1000;
    private static final int TWO_THOUSAND_MONEY = 2000;
    private static final int THREE_THOUSAND_MONEY = 3000;

    @Test
    public void should_get_correct_balance_after_several_times_of_deposit() throws Exception {
        Account account = new Account();
        account.deposit(ONE_THOUSAND_MONEY);
        assertThat(account.getBalance(), is(ONE_THOUSAND_MONEY));
        account.deposit(TWO_THOUSAND_MONEY);
        assertThat(account.getBalance(), is(THREE_THOUSAND_MONEY));
    }

    @Test
    public void should_get_correct_balance_after_withdraw() throws Exception {
        Account account = new Account();
        account.deposit(TWO_THOUSAND_MONEY);
        account.withdraw(ONE_THOUSAND_MONEY);

        assertThat(account.getBalance(), is(ONE_THOUSAND_MONEY));

        account.deposit(TWO_THOUSAND_MONEY);
        account.withdraw(ONE_THOUSAND_MONEY);
        assertThat(account.getBalance(), is(TWO_THOUSAND_MONEY));
    }
}
