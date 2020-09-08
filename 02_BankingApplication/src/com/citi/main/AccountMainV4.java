package com.citi.main;

import java.util.Scanner;

import com.citi.pojo.Account;

public class AccountMainV4 {
	public static void main(String[] args) {
		// write a code to accept accountNumber , name , balance
		// from user and set the values to Account class variables
		// also print the values entered by user.

		int accountNumber;
		String name;
		double balance;
		int amount;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter accountNumber");
		accountNumber = scanner.nextInt();

		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();

		System.out.println("Enter Balance ");
		balance = scanner.nextDouble();

//		Account account = new Account();
//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);

		Account account = new Account(accountNumber, name, balance);

//		System.out.println("Account Number :: " + account.getAccountNumber());
//		System.out.println("Name :: " + account.getName());
//		System.out.println("Balance :: " + account.getBalance());

		System.out.println("Account Details are");
		System.out.println(account);

		System.out.println("Enter amount to withdraw");
		amount = scanner.nextInt();

		boolean result = account.withdraw(amount);

		if (result) {
			System.out.println("Transaction Success");
			System.out.println("Updated Balance :: " + account.getBalance());
		} else {
			System.out.println("Transaction Failed");
			System.out.println(" Balance :: " + account.getBalance());
		}

		System.out.println("Enter amount to deposit");
		amount = scanner.nextInt();

		result = account.deposit(amount);

		if (result) {
			System.out.println("Transaction Success");
			System.out.println("Updated Balance :: " + account.getBalance());
		} else {
			System.out.println("Transaction Failed");
			System.out.println(" Balance :: " + account.getBalance());
		}

	}
}
