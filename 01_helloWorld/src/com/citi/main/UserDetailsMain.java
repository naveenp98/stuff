package com.citi.main;

import java.util.Scanner;

public class UserDetailsMain {
	public static void main(String[] args) {

		String userName;
		int age;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name");
		userName = scanner.next();
		System.out.println("Enter your age");
		age = scanner.nextInt();

		System.out.println("Hello " + userName);
		System.out.println("age :: " + age);

	}
}