package com.erinfan.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private String nickName;
    private Date dateOfBirth;
    private Account account;
    private boolean isBankCustomer;
    private java.util.Date joiningDate;

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateOfBirth);
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
        return Bank.depositMoneyForCustomer(this, sumOfMoney);
    }

    public int withdrawMoney(int sumOfMoney) throws Exception {
        return Bank.withDrawMoneyForCustomer(this, sumOfMoney);
    }

    public void setIsBankCustomer(boolean isBankCustomer) {
        this.isBankCustomer = isBankCustomer;
        if (isBankCustomer) {
            Date date = new Date(System.currentTimeMillis());
            setJoiningDate(date);
        }
    }

    public java.util.Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(java.util.Date joiningDate) {
        this.joiningDate = joiningDate;
    }
}
