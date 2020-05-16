package com.example.tddtutorial.authentication.interf;

import com.example.tddtutorial.authentication.impl.EmptyCredentialsException;

public interface AuthenicatorInterface {
    public void authenticateUser(String username, String password) throws EmptyCredentialsException;
}


