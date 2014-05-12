package com.erinfan.bank;

import java.util.regex.Pattern;

public class NickNameValidation {
    private static final Pattern NICKNAME_PATTERN = Pattern.compile("[a-z0-9]+");

    public static boolean isValidNickName(String nickName) {
        return !nickName.isEmpty() && NICKNAME_PATTERN.matcher(nickName).matches();
    }
}
