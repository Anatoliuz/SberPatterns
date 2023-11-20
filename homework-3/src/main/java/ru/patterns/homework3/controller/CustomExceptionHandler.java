package ru.patterns.homework3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import ru.patterns.homework3.domain.dto.ErrorMessage;

import javax.servlet.ServletException;

@Slf4j
@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = {Exception.class, ServletException.class})
    public ResponseEntity<ErrorMessage> handleException(Exception ex, WebRequest request) {
        log.error("Неустранимая ошибка для вызова {}", request.getContextPath(), ex);
        return ResponseEntity.internalServerError()
                .contentType(MediaType.APPLICATION_JSON)
                .headers(getHeaders())
                .body(new ErrorMessage(ex.getMessage()));
    }

    private HttpHeaders getHeaders() {
        var headers = new HttpHeaders();
        return headers;
    }
}
