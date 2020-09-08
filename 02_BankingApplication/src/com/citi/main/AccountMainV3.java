package com.citi.main;

import com.citi.pojo.Account;

public class AccountMainV3 {
	public static void main(String[] args) {
		System.out.println("in AccountMainV3 ");
		Account account = new Account();
		// create a param. constructor - constructor overloading
		Account account2 = new Account(101, "Vivek", 1000);

		System.out.println(account2);
		System.out.println("------------------------------");
		System.out.println("Account Number :: " + account2.getAccountNumber());
		System.out.println("Balance  :: " + account2.getBalance());
		System.out.println("Name :: " + account2.getName());

		System.out.println("main end");
	}
}
