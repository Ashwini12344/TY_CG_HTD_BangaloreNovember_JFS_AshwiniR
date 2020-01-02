package com.capgemini.forestjdbc.exception;

public class ForestExceptionDetails {
//@ExceptionHandler(ForestException.class)//handle exception in spring
	
	public ForestResponse handleForestException(ForestException e) {
		ForestResponse response=new ForestResponse();
		response.setStatuscode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}


}
