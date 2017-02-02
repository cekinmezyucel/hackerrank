package com.cekinmezyucel.hackerrank.algorithms.strings;

import java.util.Scanner;

public class SuperReducedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();

		System.out.println(superReduceString(s));
	}

	static String superReduceString(String s) {
		if (s.length() == 0) {
			return "Empty String";
		}

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				StringBuilder sb = new StringBuilder(s);
				sb.delete(i, i + 2);
				return superReduceString(sb.toString());
			}
		}

		return s;
	}

}
