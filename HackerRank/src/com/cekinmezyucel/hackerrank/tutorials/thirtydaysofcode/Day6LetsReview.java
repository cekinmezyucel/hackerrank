package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

public class Day6LetsReview {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			printEvenOdd(scan.next());
		}

		scan.close();
	}

	static void printEvenOdd(String s) {
		String even = "";
		String odd = "";

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				even += s.charAt(i);
			} else {
				odd += s.charAt(i);
			}
		}

		System.out.println(even + " " + odd);
	}

}
