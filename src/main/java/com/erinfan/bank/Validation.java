package com.erinfan.bank;

import java.util.regex.Pattern;

public class Validation {
    private static final Pattern NICKNAME_PATTERN = Pattern.compile("[a-z0-9]+");

    public static boolean isValidNickName(String nickName) {
        return nickName.isEmpty() ? false : NICKNAME_PATTERN.matcher(nickName).matches();
    }
}
