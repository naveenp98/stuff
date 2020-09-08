package com.citi.pojo;

// Savings "is a" Account
public class Savings extends Account {
	private boolean isSalary;

	public Savings() {
		System.out.println("Default constructor of Savings");
	}

	public Savings(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		System.out.println("Param. constructor of Saving");
		this.isSalary = isSalary;
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && isSalary && getBalance() >= amount) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > 0 && isSalary == false && getBalance() - amount >= 1500) {
			setBalance(getBalance() - amount);
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}

}
