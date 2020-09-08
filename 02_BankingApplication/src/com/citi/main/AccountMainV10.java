package com.citi.main;

import com.citi.pojo.Account;

public class AccountMainV10 {
	public static void main(String[] args) {
		
		// Auto generated account number
		
		Account account = new Account("Test1", 10000);
		System.out.println(account);
		// 101 Test1 10000

		Account account2 = new Account("Test2", 20000);
		System.out.println(account2);
		// 102 Test2 20000

		Account account3 = new Account("Test3", 15000);
		System.out.println(account3);
		// 103 Test3 15000
	
		//Hint :: 1.. Create new constructor with two args.
				//2.. Use static variable 
					
	}
}