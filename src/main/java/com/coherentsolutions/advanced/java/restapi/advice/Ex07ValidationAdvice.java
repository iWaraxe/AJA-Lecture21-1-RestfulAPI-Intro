package com.coherentsolutions.advanced.java.restapi.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Global exception handler for validation errors.
 */
@ControllerAdvice
public class Ex07ValidationAdvice {

    /**
     * Handles MethodArgumentNotValidException.
     * @param ex The exception.
     * @return Map of field errors.
     */
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> validationExceptionHandler(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage())
        );

        return errors;
    }
}
