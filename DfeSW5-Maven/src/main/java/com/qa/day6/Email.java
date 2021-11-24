package com.qa.day6;

public class Email {

	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isValidEmail(String string) {
		String regex = "[a-zA-Z0-9]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
		return string.matches(regex);
	}

}
