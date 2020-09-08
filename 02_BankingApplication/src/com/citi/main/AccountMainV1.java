package com.citi.main;

import com.citi.pojo.Account;

public class AccountMainV1 {
	public static void main(String[] args) {
		System.out.println("We are in AccountMainV1");
		
		//creating object of Account class
		Account account = new Account();
		account.setAccountNumber(101);
		account.setName("Vivek Gohil");
		account.setBalance(1000);
		
		int accNumber =  account.getAccountNumber();
		System.out.println("Account Number :: " + accNumber);
		System.out.println("Name :: " + account.getName());
		System.out.println("Balance :: " + account.getBalance());
		
		System.out.println("---------------------------------------------");
		Account account2 = new Account();
		account2.setAccountNumber(102);
		account2.setName("Trupti Vivek");
		account2.setBalance(1000);
		
		System.out.println("Account Number :: " + account2.getAccountNumber());
		System.out.println("Name :: " + account2.getName());
		System.out.println("Balance :: " + account2.getBalance());
		
		System.out.println("---------------------------------------------");
		Account account3 = new Account();
		account3.setAccountNumber(103);
		account3.setName("Abhishek Rao");
		account3.setBalance(1000);
		
		System.out.println("Account Number :: " + account3.getAccountNumber());
		System.out.println("Name :: " + account3.getName());
		System.out.println("Balance :: " + account3.getBalance());
		
		
		
		System.out.println("main end");
		
	}
}
