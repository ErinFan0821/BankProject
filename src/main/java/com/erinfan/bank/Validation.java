package com.erinfan.bank;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by techops on 5/8/14.
 */
public class Validation {
    public static boolean isValidNickName(String nickName, List<Customer> customers) {
        return isNickNameUnique(nickName, customers) && isStanderNickName(nickName);
    }

    private static boolean isNickNameUnique(String nickName, List<Customer> customers) {
        boolean isNickNameUnique = true;
        for (Customer customer : customers) {
            if (nickName.equals(customer.getNickName())) {
                isNickNameUnique = false;
                break;
            }
        }
        return isNickNameUnique;
    }

    private static boolean isStanderNickName(String nickName) {
        Pattern pattern = Pattern.compile("[a-z0-9]+");
        Matcher m = pattern.matcher(nickName);
        return m.matches();
    }
}
