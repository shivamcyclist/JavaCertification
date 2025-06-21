package com.javatest.shivam.enumeration.hw;

import com.javatest.shivam.enumeration.MessageType;
import java.util.*;
/*
Implement console program which will meet the following requirements:
Program starts and ask user to enter message type
Only ‘A’, ‘B’, ‘C’ or ‘D’ message types are allowed.
In case user entered invalid message type, program asks to enter message type again
When valid message type is entered program prints message type priority to console
Priority and Message Type implemented as enum types
Message types have next priorities:



Message Type
Priority
A
HIGH
B
MEDIUM
C
LOW
D
LOW


MessageType enum has next method:

public Priority getPriority() {
	<write your code here>
}
 */
public class EnumHomeWork {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter messageType to check its priority");
			String s = sc.nextLine();
			
			if(isValidMessage(s)) {
				MessageType message = MessageType.valueOf(s.toUpperCase());
				System.out.println(message.getPriority());
				break;
			} else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
			}
		}
	}
	private static boolean isValidMessage(String s) {
		
		if(s.equalsIgnoreCase("A") || s.equalsIgnoreCase("B") || s.equalsIgnoreCase("C") || s.equalsIgnoreCase("D"))
			return true;
		else 
			return false;
	}
	
}