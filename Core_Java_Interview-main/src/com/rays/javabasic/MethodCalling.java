package com.rays.javabasic;

public class MethodCalling {

	public static int index(int[] arr, int num) {

		for (int i = 0; i < arr.length; i++) {

			if (num == arr[i]) {
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 15, 20 };

		int num = 100;

		int index = index(arr, num);

		if (index != -1) {
			System.out.println(index);
		} else {
			System.out.println(index);
		}
	}
}
