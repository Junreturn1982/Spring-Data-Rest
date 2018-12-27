package com.guitar.config;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerConfiguration {

	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Invalid Data sent to service")
	private void notValid() {
		// TODO Auto-generated method stub

	}
	
}
