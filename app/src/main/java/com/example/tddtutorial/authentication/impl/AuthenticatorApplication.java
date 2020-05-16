package com.example.tddtutorial.authentication.impl;

import com.example.tddtutorial.authentication.interf.AuthenicatorInterface;

public class AuthenticatorApplication {

    private AuthenicatorInterface authenicator;

    public AuthenticatorApplication(AuthenicatorInterface authenicator) {
        this.authenicator = authenicator;
    }

    public  void authenticate(String username, String password) throws EmptyCredentialsException{
        this.authenicator.authenticateUser(username,password);
    }
}
