package com.user.service.payload;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder 
//used ->we follow builder pattern to build the object of the class
public class ApiResponse {
	
	private String message;
	private boolean success;
	private HttpStatus status;
}
