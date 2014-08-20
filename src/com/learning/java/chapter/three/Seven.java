package com.learning.java.chapter.three;

public class Seven {

	public static void main(String[] args) {
		Seven seven = new Seven();
		seven.printBetweenOneAndNumber(13);
	}

	void printBetweenOneAndNumber(Integer number) {
		if (number != 1) {
			if (number % 2 == 0) {
				number = number / 2;
				printAndCall(number);
			} else {
				number = 3 * number + 1;
				printAndCall(number);
			}
		}
	}

	void printAndCall(Integer number) {
		System.out.print(number + ",");
		printBetweenOneAndNumber(number);
	}

}
