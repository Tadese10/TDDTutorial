package com.example.tddtutorial.authentication.impl;

import com.example.tddtutorial.authentication.interf.AuthenicatorInterface;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.booleanThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AuthenticatorApplicationTest2 {

    @Mock
    AuthenicatorInterface authenicatorMock;

    @InjectMocks
    AuthenticatorApplication authenticatorApplication;

    @Test
    public void authenticate() throws EmptyCredentialsException {
        String username ="tadees";
        String password = "teejay";

//        when(authenicatorMock.authenticateUser(username, password)).thenReturn(true);
//        when(authenicatorMock.authenticateUser("","")).thenReturn(false);
//        when(authenicatorMock.authenticateUser("tadese","")).thenReturn(false);
//
//        boolean result = authenticatorApplication.authenticate(username, password);
//        boolean result1 = authenticatorApplication.authenticate(username, "");
//        boolean result2 = authenticatorApplication.authenticate("", "");
//
//
//        assertTrue(result);
//        assertFalse(result1);
//        assertFalse(result2);
    }
}