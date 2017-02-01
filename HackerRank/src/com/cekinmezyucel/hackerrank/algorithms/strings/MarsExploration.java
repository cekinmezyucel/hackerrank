package com.cekinmezyucel.hackerrank.algorithms.strings;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		in.close();

		int contamination = 0;

		for (int i = 0; i < s.length; i++) {
			if (((i + 1) % 3 == 1 || (i + 1) % 3 == 0) && s[i] != 'S') {
				contamination++;
			} else if ((i + 1) % 3 == 2 && s[i] != 'O') {
				contamination++;
			}
		}

		System.out.println(contamination);

	}

}
