package com.cis.hellospring;

public class HelloSpringBean {
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void destroyMessage(){
		System.out.println("\n\t Destroy method has been invoked");
	}
}
