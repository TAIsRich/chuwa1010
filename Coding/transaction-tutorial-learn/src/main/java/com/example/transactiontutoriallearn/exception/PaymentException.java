package com.example.transactiontutoriallearn.exception;

public class PaymentException extends RuntimeException{
    public PaymentException(String message) {
        super(message);
    }
}
