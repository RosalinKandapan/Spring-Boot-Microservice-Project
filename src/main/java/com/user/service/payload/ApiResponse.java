package com.user.service.payload;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder 
//used ->we follow builder pattern to build the object of the class
public class ApiResponse {
	
	private String message;
	private boolean success;
private HttpStatus status;
}*/


public class ApiResponse {
	private String message;
	private Boolean success;
	private HttpStatus status;
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiResponse(String message, Boolean success, HttpStatus status) {
		super();
		this.message = message;
		this.success = success;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	//create an inner class
	public static class ApiResponseBuilder {
        private String message;
        private Boolean success;
        private HttpStatus status;

        public ApiResponseBuilder message(String message) {
            this.message = message;
            return this;
        }

        public ApiResponseBuilder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ApiResponseBuilder status(HttpStatus status) {
            this.status = status;
            return this;
        }

        public ApiResponse build() {
            ApiResponse response = new ApiResponse();
            response.setMessage(this.message);
            response.setSuccess(this.success);
            response.setStatus(this.status);
            return response;
        }
    }

    public static ApiResponseBuilder builder() {
        return new ApiResponseBuilder();
    }
}