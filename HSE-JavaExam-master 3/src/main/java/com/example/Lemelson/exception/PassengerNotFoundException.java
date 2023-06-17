package com.example.Lemelson.exception;

public class PassengerNotFoundException extends RuntimeException {
    public PassengerNotFoundException(Long id) {
        super("Could not find flight " + id);
    }
}
