package com.cekinmezyucel.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			printSeries(a, b, n);
		}
		in.close();
	}

	public static void printSeries(int a, int b, int n) {

		for (int i = 0; i < n; i++) {
			Double calc = (double) a;
			for (int j = 0; j <= i; j++) {
				calc = calc + (Math.pow(2, j) * b);
			}
			System.out.print(calc.intValue() + " ");
		}
		System.out.println();
	}

}
