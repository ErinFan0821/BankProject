package com.erinfan.bank;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by techops on 5/12/14.
 */
public class ValidationTest {
    @Test
    public void should_be_valid_nick_name_if_name_is_standard_format() throws Exception {
        assertTrue(NickNameValidation.isValidNickName("erinfan"));
    }

    @Test
    public void should_be_invalid_nick_name_if_name_not_standard_format() throws Exception {
        assertFalse(NickNameValidation.isValidNickName("ErinFan2"));
    }

    @Test
    public void should_be_invalid_nick_name_if_name_is_empty() throws Exception {
        assertFalse(NickNameValidation.isValidNickName(""));

    }
}
