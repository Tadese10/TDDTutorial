package com.example.tddtutorial.authentication.impl;

public class EmptyCredentialsException extends Exception {
    public EmptyCredentialsException() {
        super("Empty credentials!");
    }
}
