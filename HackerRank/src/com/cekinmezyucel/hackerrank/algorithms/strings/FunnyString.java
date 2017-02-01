package com.cekinmezyucel.hackerrank.algorithms.strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			System.out.println(isItFunny(in.next()) ? "Funny" : "Not Funny");
		}

		in.close();
	}

	static boolean isItFunny(String s) {
		char[] charArr = s.toCharArray();
		int last = charArr.length - 1;

		boolean funny = true;
		for (int i = 0; i < last; i++) {
			int str = Math.abs(charArr[i + 1] - charArr[i]);
			int rev = Math.abs(charArr[last - i] - charArr[last - i - 1]);

			if (str != rev) {
				funny = false;
				break;
			}
		}

		return funny;
	}

}
