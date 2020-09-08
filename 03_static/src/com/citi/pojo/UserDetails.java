package com.citi.pojo;

public class UserDetails {

	private static int userId;
	private static int number1 = 10;
	private static int number2 = 10;
	// static block
	static {
		System.out.println("We are in a static block");
		userId = 101;
	}

	{
		System.out.println("We are in a non static block");
	}

	//static function contains only static variables 
	//call static functions without creating object of a class
	public static void display() {
		System.out.println("number1 :: " + number1);
		System.out.println("number2 :: " + number2);

		number1 = number1 + 10;
		number2 = number2 + 10;

		System.out.println("number1 :: " + number1);
		System.out.println("number2 :: " + number2);
	}

	public UserDetails() {
		System.out.println("Default Constructor of UserDetails");
		System.out.println("UserId :: " + userId);
	}
}