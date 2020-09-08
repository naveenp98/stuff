package com.citi.main;

import java.util.Scanner;

import com.citi.pojo.Savings;

public class AccountMainV6 {
	public static void main(String[] args) {

		int transactionChoice;
		String continueChoice;
		int amount;

		Scanner scanner = new Scanner(System.in);

		Savings savings = new Savings(101, "Vivek Gohil", 3000, false);

		System.out.println(savings);
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

				if (savings.withdraw(amount)) {
					System.out.println("Transaction Success");
					System.out.println("Updated Balance :: " + savings.getBalance());
				} else {
					System.out.println("Transaction Failed");
					System.out.println("Balance :: " + savings.getBalance());
				}
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextInt();

				if (savings.deposit(amount)) {
					System.out.println("Transaction Success");
					System.out.println("Updated Balance :: " + savings.getBalance());
				} else {
					System.out.println("Transaction Failed");
					System.out.println("Balance :: " + savings.getBalance());
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
