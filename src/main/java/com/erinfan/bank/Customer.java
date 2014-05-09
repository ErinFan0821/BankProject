package com.erinfan.bank;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by techops on 5/7/14.
 */
public class Customer {
    private String nickName;
    private Date dateOfBirth;
    private Account account;

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = sdf.parse(dateOfBirth);
        this.dateOfBirth = new Date(date.getTime());
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int depositMoney(int sumOfMoney) {
        account.deposit(sumOfMoney);
        return account.getBalance();
    }
}
