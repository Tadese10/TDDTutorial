package com.example.tddtutorial.authentication.impl;

import com.example.tddtutorial.authentication.interf.AuthenicatorInterface;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

public class AuthenticatorApplicationTest{

    @Test
    public void testAuthenticate() throws EmptyCredentialsException{
        AuthenicatorInterface authenicatorMock;
        AuthenticatorApplication authenticator;
        String username = "Ade";
        String password = "Olu";

        authenicatorMock = Mockito.mock(AuthenicatorInterface.class);
        authenticator = new AuthenticatorApplication(authenicatorMock);

//        InOrder inOrder = Mockito.inOrder(authenicatorMock);
//        inOrder.

        doThrow(new EmptyCredentialsException()).when(authenicatorMock).authenticateUser(username,password);
//        when(authenicatorMock.authenticateUser(username,password)).thenReturn(true);
//
//        when(authenicatorMock.authenticateUser("","")).thenThrow(new EmptyCredentialsException());

//        boolean actual = authenticator.authenticate(username,password);
//        boolean actual1 = authenticator.authenticate("","");

//        assertEquals(actual, actual1);

        verify(authenicatorMock).authenticateUser(username,password);

//        verify(authenicatorMock, Mockito.never()).authenticateUser(username,password);

//        verify(authenicatorMock).authenticateUser(username, "Tadese");
        verify(authenicatorMock);
    }
    @Test
    public void spyExampleTest() {
        Map<String, String> hashMap = new HashMap<String, String>();
        Map<String, String> hashMapSpy = spy(hashMap);


        System.out.println(hashMapSpy.get("key")); // Will print null.
        hashMapSpy.put("key", "A value");
        System.out.println(hashMapSpy.get("key")); // Will print "A value".
        when(hashMapSpy.get("key")).thenReturn("Another value");
        System.out.println(hashMapSpy.get("key")); // Will print "Another value".
    }

}