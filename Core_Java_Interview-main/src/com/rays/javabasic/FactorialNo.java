package com.rays.javabasic;

public class FactorialNo {
	public static void main(String[] args) {
		int fact = 1;
		int num = 5;

		for (int i = num; i > 0; i--) {

			fact = fact * i;

		}
		System.out.println(fact);

	}

}
