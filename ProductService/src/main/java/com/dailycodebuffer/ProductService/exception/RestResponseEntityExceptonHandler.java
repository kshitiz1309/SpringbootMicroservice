package com.dailycodebuffer.ProductService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dailycodebuffer.ProductService.model.ErrorResponse;

@ControllerAdvice
public class RestResponseEntityExceptonHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(ProductServiceCustomException.class)
	public ResponseEntity<ErrorResponse> hendleProductServiceException(ProductServiceCustomException productServiceCustomException) {
		return new ResponseEntity<>(new ErrorResponse().builder()
				.errorMessage(productServiceCustomException.getMessage())
				.errorCode(productServiceCustomException.getErrorCode())
				.build(),HttpStatus.NOT_FOUND);
		
	}
}
