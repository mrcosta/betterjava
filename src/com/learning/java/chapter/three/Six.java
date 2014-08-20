package com.learning.java.chapter.three;

public class Six {

	public static void main(String[] args) {
		Integer first = 0;
		Integer second = 1;

		System.out.println(first);
		System.out.println(second);

		Six six = new Six();
		six.printFibonacci(first, second);
	}

	public void printFibonacci(Integer first, Integer second) {
		System.out.println(first + second);
		if ((first + second <= 100 )) {
			printFibonacci(second, first + second);
		}
	}
}
