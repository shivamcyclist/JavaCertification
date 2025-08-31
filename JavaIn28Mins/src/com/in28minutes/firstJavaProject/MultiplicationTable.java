package com.in28minutes.firstJavaProject;

public class MultiplicationTable {

	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();// can be also written as System.out.printf("%d *
																		// %d = %d",5,i,5 * i).println();
		}
		System.out.println();
	}

	void print(int table) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MultiplicationTable mx = new MultiplicationTable();
		mx.print();
		mx.print(12);
	}
}
