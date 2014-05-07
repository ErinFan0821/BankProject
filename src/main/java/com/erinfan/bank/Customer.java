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

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = (Date) sdf.parse(dateOfBirth);
        this.dateOfBirth = new Date(date.getTime());
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}