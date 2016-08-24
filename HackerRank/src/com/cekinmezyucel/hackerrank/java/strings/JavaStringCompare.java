package com.cekinmezyucel.hackerrank.java.strings;

import java.util.Scanner;

public class JavaStringCompare {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int length = scan.nextInt();
		String max = word.substring(0, length);
		String min = word.substring(0, length);

		for (int i = 0; i < word.length() - length + 1; i++) {
			String temp;
			temp = word.substring(i, i + length);
			if (temp.compareTo(max) > 0) {
				max = temp;
			}

			if (temp.compareTo(min) < 0) {
				min = temp;
			}
		}

		System.out.println(min);
		System.out.println(max);

		scan.close();
	}

}
