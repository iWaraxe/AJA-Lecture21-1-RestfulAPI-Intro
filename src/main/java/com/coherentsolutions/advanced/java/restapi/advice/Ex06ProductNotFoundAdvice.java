package com.coherentsolutions.advanced.java.restapi.advice;

import com.coherentsolutions.advanced.java.restapi.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Global exception handler for ProductNotFoundException.
 */
@ControllerAdvice
public class Ex06ProductNotFoundAdvice {

    /**
     * Handles ProductNotFoundException.
     * @param ex The exception.
     * @return Error message.
     */
    @ResponseBody
    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String productNotFoundHandler(ProductNotFoundException ex) {
        return ex.getMessage();
    }
}
