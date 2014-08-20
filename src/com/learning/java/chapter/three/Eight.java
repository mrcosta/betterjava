package com.learning.java.chapter.three;

public class Eight {

	public static void main(String[] args) {
		Eight eight = new Eight();

		eight.printTable(5);
	}

	void printTable(Integer n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j + ",");
			}
			System.out.println();
		}
	}
}
