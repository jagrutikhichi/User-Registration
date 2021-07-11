package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImpl implements UserRegistraion{

	@Override
	public void firstNameValidate() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first name");
		String name = sc.next();

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,20}$");
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
		} else {
			System.out.println("Given name id is not valid");
		}	
	}

	@Override
	public void lastNameValidate() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your last name");
		String name = sc.next();

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,20}$");
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
		} else {
			System.out.println("Given last name id is not valid");
		}
	}

	@Override
	public void emailValidate() {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Email id");
        String email = sc.next();

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
        }else{
            System.out.println("Given email id is not valid");
        }
	}

	@Override
	public void mobileValidate() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Mobile number");
		String email = sc.next();

		Pattern pattern = Pattern.compile("^(91){1}[0-9]{10}$");
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
		} else {
			System.out.println("Given mobile number. is not valid");
		}
	}

	@Override
	public void passwordValidate() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Password");
		String password = sc.next();

		Pattern pattern = Pattern.compile("^(?=.{8,20})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
		Matcher matcher = pattern.matcher(password);
		if (matcher.matches()) {
		} else {
			System.out.println("Given password is not valid");
		}
	}
	

}
