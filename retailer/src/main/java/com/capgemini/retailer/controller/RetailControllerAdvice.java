package com.capgemini.retailer.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailer.dto.RetailResponse;
import com.capgemini.retailer.exception.RetailException;

@RestControllerAdvice
public class RetailControllerAdvice {
	@ExceptionHandler(RetailException.class)
    public RetailResponse handleProductException (RetailException e) {
	RetailResponse retailResponse =  new RetailResponse();
	retailResponse.setStatusCode(501);
	retailResponse.setMessage("Exception");
	retailResponse.setDescription(e.getMessage());
	return retailResponse;
}
	

}
