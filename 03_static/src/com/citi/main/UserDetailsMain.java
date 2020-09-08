package com.citi.main;

import com.citi.pojo.UserDetails;

public class UserDetailsMain {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("in UserDetailsMain");
		Class.forName("com.citi.pojo.UserDetails");
		// UserDetails details = new UserDetails();
		UserDetails.display();
		System.out.println("-----------------------------");
		// UserDetails details2 = new UserDetails();
		UserDetails.display();
		System.out.println("UserDetailsMain end");
	}
}