package com.erinfan.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Customer {
    private String nickName;
    private Date dateOfBirth;
    private Account account;
    private boolean isBankCustomer;
    private Date joiningDate;

    public Customer() {
        this.account = new Account();
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        parser.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        this.dateOfBirth = parser.parse(dateOfBirth);
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

    public void setIsBankCustomer(boolean isBankCustomer) {
        this.isBankCustomer = isBankCustomer;
        if (isBankCustomer) {
            Date date = new Date(System.currentTimeMillis());
            setJoiningDate(date);
        }
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }
}
