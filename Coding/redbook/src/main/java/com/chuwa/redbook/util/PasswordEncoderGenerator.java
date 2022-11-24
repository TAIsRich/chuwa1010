package com.chuwa.redbook.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// this main method is just a test utility for learning how the password encoder transfer a String password to some hash value
public class PasswordEncoderGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("chuwa"));
    }
}
