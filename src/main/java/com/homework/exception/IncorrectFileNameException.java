package com.homework.exception;

public class IncorrectFileNameException extends Exception {

    public IncorrectFileNameException(String errorMessage) {
        super(errorMessage);
    }
}