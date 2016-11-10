package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

public class Day9Recursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int factorial = 1;

		factorial(n, factorial);

		scan.close();
	}

	static void factorial(int n, int factorial) {
		if (n == 0) {
			System.out.println(factorial);
			return;
		} else {
			factorial((n - 1), (n * factorial));
		}
	}

}
