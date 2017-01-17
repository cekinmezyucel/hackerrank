package com.cekinmezyucel.hackerrank.algorithms.dynamicprogramming;

import java.util.Scanner;

public class StringReduction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		while (t-- > 0) {
			calculateLength(scan.next().toCharArray());
		}

		scan.close();
	}

	static void calculateLength(char[] arr) {
		int a = 0;
		int b = 0;
		int c = 0;

		for (char ch : arr) {
			if (ch == 'a') {
				a++;
			} else if (ch == 'b') {
				b++;
			} else {
				c++;
			}
		}

		if ((a % 2 == 0 && b % 2 == 0 && c % 2 == 0) || (a % 2 != 0 && b % 2 != 0 && c % 2 != 0)) {
			System.out.println(2);
		} else if ((a == 0 && b == 0) || (a == 0 && c == 0) || (c == 0 && b == 0)) {
			System.out.println(arr.length);
		} else {
			System.out.println(1);
		}
	}
}
