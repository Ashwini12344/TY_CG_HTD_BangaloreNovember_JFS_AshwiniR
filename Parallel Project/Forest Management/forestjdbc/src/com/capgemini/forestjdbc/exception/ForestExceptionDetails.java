package com.capgemini.forestjdbc.exception;

public class ForestExceptionDetails {

	public ForestResponse handleForestException(ForestException e) {
		ForestResponse response=new ForestResponse();
		response.setStatuscode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}


}
