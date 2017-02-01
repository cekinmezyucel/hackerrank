package com.cekinmezyucel.hackerrank.algorithms.strings;

import java.util.Scanner;

public class TheLoveLetterMystery {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			char[] s = in.next().toCharArray();
			int changes = 0;

			for (int i = 0; i < s.length / 2; i++) {
				changes += Math.abs(s[i] - s[s.length - 1 - i]);
			}

			System.out.println(changes);
		}
		in.close();
	}

}
