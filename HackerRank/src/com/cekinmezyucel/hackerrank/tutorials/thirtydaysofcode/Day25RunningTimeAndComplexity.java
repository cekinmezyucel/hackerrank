package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

public class Day25RunningTimeAndComplexity {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for (int i = 0; i < testCases; i++) {
			System.out.println((isPrime(scan.nextInt()) ? "Prime" : "Not prime"));
		}
		scan.close();
	}

	public static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		} else if (n == 1 || (n & 1) == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
