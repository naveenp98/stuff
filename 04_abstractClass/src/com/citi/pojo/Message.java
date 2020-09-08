package com.citi.pojo;

public class Message {
	public void printMessage(String from, String to, String message) {
		System.out.println("Message Received from :: " + from);
		System.out.println("Message Body :: " + message);
		System.out.println("To :: " + to);
	}
}