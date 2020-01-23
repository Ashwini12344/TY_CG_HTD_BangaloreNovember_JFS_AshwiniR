package com.capgemini.forestcollection.exception;

public class ForestException extends RuntimeException{
	String str;
	
	public ForestException(String message) {
		this.str=message;
	}
	@Override
	public String getMessage() {
		return str;
	}
	
	

}
