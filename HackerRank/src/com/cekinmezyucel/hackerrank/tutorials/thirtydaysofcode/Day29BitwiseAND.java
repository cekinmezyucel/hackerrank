package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

public class Day29BitwiseAND {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		while (t-- > 0) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int result = 0;
			for (int i = 1; i <= n - 1; i++) {
				for (int j = i + 1; j <= n; j++) {
					int and = i & j;
					if (and > result && and < k) {
						result = and;
					}
				}

			}

			System.out.println(result);
		}
		scan.close();
	}

}
