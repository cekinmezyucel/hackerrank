package com.cekinmezyucel.hackerrank.algorithms.strings;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			String s = in.next();
			int deleteOperation = 0;
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) == s.charAt(i + 1)) {
					deleteOperation++;
				}
			}

			System.out.println(deleteOperation);
		}

		in.close();
	}

}
