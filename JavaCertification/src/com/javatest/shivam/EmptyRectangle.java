package com.javatest.shivam;

import java.util.Scanner;
public class EmptyRectangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		for(int i =0;i<height;i++) {
			for(int j =0;j<width;j++){
				if(i==0 || j==0)
					System.out.print("*");
				else if(i==height-1 && j!=0 || j==width-1 && i!=0)
					System.out.print("*");
				else if(j!=width-1 && i!=height-1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}