package com.citi.main;

import java.util.Scanner;

import com.citi.pojo.Account;
import com.citi.pojo.Current;
import com.citi.pojo.Savings;

public class AccountMainV8 {
	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		boolean isSalary;
		double amount;
		double overdraftBalance;
		int accountChoice, transactionChoice;
		String continueChoice;
		Savings savings = null;
		Current current = null;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to XYZ Bank");
		System.out.println("Menu");
		System.out.println("1. Create Savings Account");
		System.out.println("2. Create Current Account");
		System.out.println("Please select account type");
		accountChoice = scanner.nextInt();

		System.out.println("Enter accountNumber");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		if (accountChoice == 1) {
			System.out.println("Do you want to open Salary account");
			isSalary = scanner.nextBoolean();
			//
			savings = new Savings(accountNumber, name, balance, isSalary);
			System.out.println("Account Opend Successfully");
			System.out.println(savings);
			do {
				System.out.println("Menu");
				System.out.println("1.. Withdraw");
				System.out.println("2.. Deposit");
				System.out.println("3.. Display Balance");
				System.out.println("4.. Exit");
				System.out.println("Enter your choice");
				transactionChoice = scanner.nextInt();
				switch (transactionChoice) {
				case 1:
					System.out.println("Enter amount to withdraw");
					amount = scanner.nextDouble();
					if (savings.withdraw(amount))
						System.out.println("Transaction Success !! \n Updated Balance is " + savings.getBalance());
					else
						System.out.println("Transaction Faild !! \n  Balance is " + savings.getBalance());
					break;
				case 2:
					System.out.println("Enter amount to deposit");
					amount = scanner.nextDouble();
					if (savings.deposit(amount))
						System.out.println("Transaction Success !! \n Updated Balance is " + savings.getBalance());
					else
						System.out.println("Transaction Faild !! \n  Balance is " + savings.getBalance());
					break;
				case 3:
					System.out.println("Transaction Success !! \n Updated Balance is " + savings.getBalance());
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
				System.out.println("Do you want to continue ?? yes || no");
				continueChoice = scanner.next();
			} while (continueChoice.equals("yes"));
		}
		if (accountChoice == 2) {
			System.out.println("Enter overdraft balance");
			overdraftBalance = scanner.nextDouble();
			current = new Current(accountNumber, name, balance, overdraftBalance);
			System.out.println(current);
			System.out.println("Account Opend Successfully");
			System.out.println(current);
			do {
				System.out.println("Menu");
				System.out.println("1.. Withdraw");
				System.out.println("2.. Deposit");
				System.out.println("3.. Display Balance");
				System.out.println("4.. Exit");
				System.out.println("Enter your choice");
				transactionChoice = scanner.nextInt();
				switch (transactionChoice) {
				case 1:
					System.out.println("Enter amount to withdraw");
					amount = scanner.nextDouble();
					if (current.withdraw(amount)) {
						System.out.println("Transaction Success !! \n Updated Balance is " + current.getBalance());
						System.out.println("Overdraft Balance :: " + current.getOverdraftBalance());
					} else {
						System.out.println("Transaction Faild !! \n  Balance is " + current.getBalance());
						System.out.println("Overdraft Balance :: " + current.getOverdraftBalance());
					}
					break;
				case 2:
					System.out.println("Enter amount to deposit");
					amount = scanner.nextDouble();
					if (current.deposit(amount)) {
						System.out.println("Transaction Success !! \n Updated Balance is " + current.getBalance());
						System.out.println("Overdraft Balance :: " + current.getOverdraftBalance());
					} else {
						System.out.println("Transaction Faild !! \n  Balance is " + current.getBalance());
						System.out.println("Overdraft Balance :: " + current.getOverdraftBalance());
					}
					break;
				case 3:
					System.out.println("Transaction Success !! \n Updated Balance is " + current.getBalance());
					System.out.println("Overdraft Balance :: " + current.getOverdraftBalance());
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
				System.out.println("Do you want to continue ?? yes || no");
				continueChoice = scanner.next();
			} while (continueChoice.equals("yes"));
		}

	}
}
