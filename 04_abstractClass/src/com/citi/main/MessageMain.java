package com.citi.main;

import java.util.Scanner;

import com.citi.pojo.EmailMessage;
import com.citi.pojo.Message;
import com.citi.pojo.SMSMessage;

public class MessageMain {
	public static void main(String[] args) {
		int messageChoice;
		Message message = null;
		Scanner scanner = new Scanner(System.in);

		System.out.println("1.. SMS Message");
		System.out.println("2.. Email Message");
		System.out.println("Enter your choice");
		messageChoice = scanner.nextInt();

		switch (messageChoice) {
		case 1:
			message = new SMSMessage();
			break;
		case 2:
			message = new EmailMessage();
			break;
		}

		message.printMessage("Vivek", "Trupti", "Hello !!");

	}
}

