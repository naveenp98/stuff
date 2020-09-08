
package com.citi.pojo;

public class EmailMessage extends Message {

	public void printMessage(String from, String to, String message) {
		System.out.println("Printing EmailMessage");
		System.out.println("Message Received from :: " + from);
		System.out.println("Message Body :: " + message);
		System.out.println("To :: " + to);
	}

}