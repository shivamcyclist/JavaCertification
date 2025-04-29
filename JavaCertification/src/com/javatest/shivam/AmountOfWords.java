package com.javatest.shivam;

import java.util.Arrays;
import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String str = sc.nextLine();
		int amountOfWords = getWordsAmount(str);
	
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {
		int n =0;
		String str[] = text.split("\\s+");
		n= str.length;
		return n;
	}
}