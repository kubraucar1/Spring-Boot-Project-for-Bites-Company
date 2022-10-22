package com.xss.test.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.DateTimeException;

@org.springframework.web.bind.annotation.ControllerAdvice

public class ControllerAdvice {
    /*
        @ExceptionHandler(value = DateTimeException.class)
        @ResponseStatus(HttpStatus.BAD_REQUEST)
        public @ResponseBody ErrorResponse handleDateTimeException(DateTimeException ex) {
            return new ErrorResponse(505, "Enter a valid date!");
        }
    */
    @ExceptionHandler(DateTimeException.class)
    public ResponseEntity<String> handleRuntimeException(DateTimeException dateTimeException) {
        return new ResponseEntity<String>("Enter a valid date !", HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(ResutEmpty.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody ErrorResponse handleResultEmpty(ResutEmpty resutEmpty){
        return new ErrorResponse(123,"There is no record!");
    }




}
