package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AppendAndDelete {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();

		int same = 0;
		for (int i = 0; i < s.length(); i++) {
			if (t.length() > i && s.charAt(i) == t.charAt(i)) {
				same++;
			} else {
				break;
			}
		}
		int sOperation = s.substring(same).length();
		int tOperation = t.substring(same).length();

		printResult(s, t, k, sOperation, tOperation);
		in.close();

	}

	static void printResult(String s, String t, int k, int sOperation, int tOperation) {
		if (s.equals(t)) {
			if (k >= s.length()) {
				System.out.println("Yes");
				return;
			}
		}

		if (s.length() + t.length() < k) {
			System.out.println("Yes");
			return;
		}

		if (sOperation < s.length()) {
			if (((k - (sOperation + tOperation)) % 2 == 0) && (k - (sOperation + tOperation)) >= 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			if ((k - (sOperation + tOperation)) >= 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
