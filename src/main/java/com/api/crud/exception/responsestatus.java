package com.api.crud.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class responsestatus extends RuntimeException{

	public responsestatus (String message) {
		
		super(message);
		
	}
	
}
