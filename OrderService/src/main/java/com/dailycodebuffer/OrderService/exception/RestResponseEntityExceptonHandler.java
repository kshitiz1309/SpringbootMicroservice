package com.dailycodebuffer.OrderService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dailycodebuffer.OrderService.external.response.ErrorResponse;

@ControllerAdvice
public class RestResponseEntityExceptonHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ErrorResponse> hendleCustomException(CustomException customException) {
		return new ResponseEntity<>(new ErrorResponse().builder()
				.errorMessage(customException.getMessage())
				.errorCode(customException.getErrorCode())
				.build(),HttpStatus.valueOf(customException.getStatus()));
		
	}
}
