package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long n = in.nextLong();
		long div = n / s.length();
		int mod = (int) (n % s.length());
		System.out.println((countOfA(s) * div) + countOfA(s.substring(0, mod)));
	}

	private static int countOfA(String s) {
		return s.length() - s.replace("a", "").length();
	}

}
