package com.jsp.studentDatabaseManagementSystem.customeexception;

@SuppressWarnings("serial")
public class StudentNotFound extends RuntimeException {
	private String message;

	public void StudentNotFoundException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
