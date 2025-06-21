package com.javatest.shivam.enumeration.hw;

import com.javatest.shivam.enumeration.Priority;

public class EnumDemo {

	public static void main(String[] args) {
		
		Priority pri = Priority.HIGH;
		
		switch(pri) {
		case HIGH:
			System.out.println("Priority is high.");
			break;
		case MEDIUM:
			System.out.println("Priority is medium.");
			break;
		case LOW:
			System.out.println("Priority is low.");
			break;
		default:
			System.out.println("Invalid Priority");
		}
		
	}
}
