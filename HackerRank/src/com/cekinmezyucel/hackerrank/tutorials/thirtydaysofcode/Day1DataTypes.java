package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

public class Day1DataTypes {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int scanInt;
		double scanDouble;
		String scanString;

		/* Read and save an integer, double, and String to your variables. */

		scanInt = scan.nextInt();
		scanDouble = scan.nextDouble();
		scan.nextLine();
		scanString = scan.nextLine();

		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + scanInt);

		/* Print the sum of the double variables on a new line. */
		System.out.println(d + scanDouble);
		/*
		 * Concatenate and print the String variables on a new line; the 's'
		 * variable above should be printed first.
		 */
		System.out.println(s + scanString);

		scan.close();
	}
}
