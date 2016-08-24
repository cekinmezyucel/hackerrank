package com.cekinmezyucel.hackerrank.java.strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		int count = A.length() + B.length();
		System.out.println(count);
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		String capialA = A.substring(0, 1).toUpperCase() + A.substring(1);
		String capialB = B.substring(0, 1).toUpperCase() + B.substring(1);

		System.out.println(capialA + " " + capialB);

		sc.close();

	}

}
