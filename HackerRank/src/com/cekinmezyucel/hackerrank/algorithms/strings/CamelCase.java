package com.cekinmezyucel.hackerrank.algorithms.strings;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();

		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				count = count + 1;
			}
		}

		System.out.println(count);
	}

}
