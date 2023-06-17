package com.example.Lemelson.handler;


import com.example.Lemelson.exception.PassengerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(PassengerNotFoundException.class)
    public ResponseEntity<ErrorResponse> handlePassengerNotFoundException() {
        ErrorResponse error = new ErrorResponse();
        error.setMessage(CustomError.PASSENGER_NOT_FOUND.getMessage());
        error.setCustomErrorCode(CustomError.PASSENGER_NOT_FOUND.getCode());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
