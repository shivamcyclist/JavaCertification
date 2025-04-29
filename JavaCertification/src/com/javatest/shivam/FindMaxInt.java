package com.javatest.shivam;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	static int maxInt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
	    String s = sc.nextLine();
	    String str[] = s.split("\\s+");
	    int intArray[] = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
 		System.out.println("*** Max number in array ***");
 		maxInt = findMaxIntInArray(intArray);
 		System.out.println(maxInt);
	}
	
 	public static int findMaxIntInArray(int[] intArray) {
 		return Arrays.stream(intArray).max().getAsInt();
 	}
}

