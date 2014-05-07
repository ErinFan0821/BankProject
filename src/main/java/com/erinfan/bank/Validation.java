package com.erinfan.bank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by techops on 5/8/14.
 */
public class Validation {
    public static boolean isValidNickName(String nickName) {
        Pattern pattern = Pattern.compile("[a-z0-9]+");
        Matcher m = pattern.matcher(nickName);
        return m.matches();
    }
}
