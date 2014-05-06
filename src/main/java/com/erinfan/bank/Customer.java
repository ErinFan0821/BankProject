package com.erinfan.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        SimpleDateFormat bartDateFormat =
                new SimpleDateFormat("MM-dd-yyyy");
        Date date = bartDateFormat.parse(dateOfBirth);

        this.dateOfBirth = date;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
