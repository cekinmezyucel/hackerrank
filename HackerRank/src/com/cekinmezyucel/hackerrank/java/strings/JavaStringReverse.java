package com.cekinmezyucel.hackerrank.java.strings;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = new String();

		for (int i = A.length() - 1; i >= 0; i--) {
			B += A.charAt(i);
		}

		if (A.equalsIgnoreCase(B)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
