package com.javamentor.qa.platform.Exeption;

public class PageException extends RuntimeException {
    public PageException() {
    }

    public PageException(String message) {
        super(message);
    }
}
