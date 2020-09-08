package com.citi.main;

import com.citi.pojo.Account;

public class AccountMainV2 {
	public static void main(String[] args) {
		// creating object of Account classs
		// Account account = new Account();

		// creating ref - variable - String name = "Vivek" = new String("Vivek");
		Account account;

		// creating Object
		account = new Account();

		Account account2 = new Account();
		System.out.println("HashCode :: " + account.hashCode());
		System.out.println("HashCode :: " + account2.hashCode());

	}
}
