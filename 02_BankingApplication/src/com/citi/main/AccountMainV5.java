package com.citi.main;

import java.util.Scanner;

import com.citi.pojo.Account;

public class AccountMainV5 {
	public static void main(String[] args) {
		// write a code to accept accountNumber , name , balance
		// from user and set the values to Account class variables
		// also print the values entered by user.
		// print the menu as given below
		// Select Transaction Type Menu
		// 1.Withdraw
		// 2.Deposit
		// Accept amount for <transactionType> and print the status of transaction
		// Do you want to continue ? yes-no
		// if choice is yes then print the Menu again
		int accountNumber;
		String name;
		double balance;
		int transactionChoice;
		String continueChoice;
		int amount;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter accountNumber");
		accountNumber = scanner.nextInt();

		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();

		System.out.println("Enter Balance ");
		balance = scanner.nextDouble();

		Account account = new Account(accountNumber, name, balance);

		System.out.println("Account Details are");
		System.out.println(account);
		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("Enter your choice");
			transactionChoice = scanner.nextInt();

			switch (transactionChoice) {
			case 1:
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextInt();

				if (account.withdraw(amount)) {
					System.out.println("Transaction Success");
					System.out.println("Updated Balance :: " + account.getBalance());
				} else {
					System.out.println("Transaction Failed");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextInt();

				if (account.deposit(amount)) {
					System.out.println("Transaction Success");
					System.out.println("Updated Balance :: " + account.getBalance());
				} else {
					System.out.println("Transaction Failed");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;
			default:
				System.out.println("Invalid Transaction Choice");
				break;
			}
			System.out.println("Do you want to perfom other transaction yes || no");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
		System.out.println("Thank you for banking with us!");

	}
}
