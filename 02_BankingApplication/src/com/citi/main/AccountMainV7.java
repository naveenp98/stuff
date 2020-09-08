package com.citi.main;

import com.citi.pojo.Current;

public class AccountMainV7 {
	public static void main(String[] args) {
		Current current = new Current(101, "Vivek", 1000, 50000);

		System.out.println(current);

		// 1. withdraw(500)
		System.out.println("current.withdraw(500);");
		current.withdraw(500);
		System.out.println(current); // bal = 500 and overdraftBalance = 50000
		System.out.println("______________________________________________");
		// 2. withdraw(5000)
		System.out.println("current.withdraw(5000);");
		current.withdraw(5000);
		System.out.println(current); // bal = 0 and overdraftBalance = 45500
		System.out.println("______________________________________________");
		// 3. deposit(2000)
		System.out.println("current.deposit(2000);");
		current.deposit(2000);
		System.out.println(current); // bal = 0 and overdraftBalance = 47500
		System.out.println("______________________________________________");
		// 4. deposit(5000)
		System.out.println("current.deposit(5000);");
		current.deposit(5000);
		System.out.println(current); // bal = 2500 and overdraftBalance = 50000
		System.out.println("______________________________________________");
	}
}
