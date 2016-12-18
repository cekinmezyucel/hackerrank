package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

public class Day26NestedLogic {

	public static final int yearFine = 10000;
	public static final int monthFine = 500;
	public static final int dayFine = 15;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d2 = scan.nextInt();
		int m2 = scan.nextInt();
		int y2 = scan.nextInt();
		int d1 = scan.nextInt();
		int m1 = scan.nextInt();
		int y1 = scan.nextInt();

		if (y2 > y1) {
			calculateFine(1, yearFine);
			return;
		} else if (y2 < y1) {
			System.out.println(0);
			return;
		} else if (m2 > m1) {
			calculateFine((m2 - m1), monthFine);
			return;
		} else if (d2 > d1) {
			calculateFine((d2 - d1), dayFine);
			return;
		} else {
			System.out.println(0);
		}
	}

	static void calculateFine(int factor, int fine) {
		System.out.println(factor * fine);
	}

}
