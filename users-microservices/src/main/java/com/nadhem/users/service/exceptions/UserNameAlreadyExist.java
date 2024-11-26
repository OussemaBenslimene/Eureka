package com.nadhem.users.service.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UserNameAlreadyExist extends RuntimeException {
	
private String message;
	
	public UserNameAlreadyExist(String message)
	{
		super(message);
	}

}
