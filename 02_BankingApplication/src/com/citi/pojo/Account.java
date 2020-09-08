package com.citi.pojo;

public abstract class Account {
	// instance level variables
	private int accountNumber;
	private String name;
	private double balance;
	private static int accountNumberGenerator = 101;

	// default constructor
	public Account() {
		System.out.println("Default constructor of Account");
	}

	public Account(int accountNumber, String name, double balance) {
		System.out.println("Param. constructor of Account");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public Account(String name, double balance) {
		System.out.println("Param. constructor of Account");
		accountNumber = accountNumberGenerator;
		this.name = name;
		this.balance = balance;
		accountNumberGenerator++;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract boolean withdraw(double amount);

	public abstract boolean deposit(double amount);

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
