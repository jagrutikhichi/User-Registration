package com.bridgelabz;

public class UserRegitrationMain {

	public static void main(String[] args) {
		UserRegistrationImpl myObj = new UserRegistrationImpl();
		myObj.firstNameValidate();
		myObj.lastNameValidate();
		myObj.emailValidate();
		myObj.mobileValidate();
	}

}
