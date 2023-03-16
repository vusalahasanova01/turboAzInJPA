package com.turbo.az.turboAzInJPA.exception.handler;

import com.turbo.az.turboAzInJPA.exception.CarNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
    @ExceptionHandler(CarNotFoundException.class)
    public ResponseEntity<ErrorMessage> handleCarNotFoundException() {
        String errorText = "car not found";
        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_ACCEPTABLE.value(), errorText);
        return ResponseEntity.badRequest().body(errorMessage);
    }

}
