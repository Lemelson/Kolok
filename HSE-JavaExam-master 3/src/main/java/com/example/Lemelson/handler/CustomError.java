package com.example.Lemelson.handler;

public enum CustomError {
    PASSENGER_NOT_FOUND(1001, "Passenger not found");


    private final int code;
    private final String message;

    CustomError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
