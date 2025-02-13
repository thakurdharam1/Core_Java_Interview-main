package com.rays.string;

public class CountOccuraceOfaChar {

	public static void main(String[] args) {
		String name = "kapil dudhe";

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			String m = String.valueOf(ch);

			if (m.matches("d")) {
				count++;
			}

		}
		System.out.println("d:" + count);
	}

}
