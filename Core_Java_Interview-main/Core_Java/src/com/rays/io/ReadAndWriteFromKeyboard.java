package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWriteFromKeyboard {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("C://Users//hp//Desktop//IO/kapill",true);

		System.out.println("enter here.....");

		String str = br.readLine();

		while (str != null) {
			fw.write(str);

			System.out.println(str);
			str = br.readLine();

		}
		br.close();
	}

}
