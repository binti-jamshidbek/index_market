package com.example.index_market.exception.service;

import com.example.index_market.response.AppError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@ControllerAdvice("com.example.onlinequeue")
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.FORBIDDEN)
    public AppError invalidTokenExceptionHandler(RuntimeException e, WebRequest request) {
        return AppError.builder()
                .message(e.getMessage())
                .request(request)
                .status(HttpStatus.FORBIDDEN)
                .build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AppError badRequestException(RuntimeException e, WebRequest request) {
        return AppError.builder()
                .message(e.getMessage())
                .request(request)
                .status(HttpStatus.BAD_REQUEST)
                .build();
    }
    @ResponseStatus(HttpStatus.CONFLICT)
    public AppError conflictException(RuntimeException e, WebRequest request) {
        return AppError.builder()
                .message(e.getMessage())
                .request(request)
                .status(HttpStatus.CONFLICT)
                .build();
    }
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public AppError notFoundException(RuntimeException e, WebRequest request) {
        return AppError.builder()
                .message(e.getMessage())
                .request(request)
                .status(HttpStatus.NOT_FOUND)
                .build();
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public AppError noContentException(RuntimeException e, WebRequest request) {
        return AppError.builder()
                .message(e.getMessage())
                .request(request)
                .status(HttpStatus.NO_CONTENT)
                .build();
    }



}
