package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();

			squares(a, b);
		}

		in.close();
	}

	static void squares(int a, int b) {
		int count = 0;

		Double firstSquare = Math.ceil(Math.sqrt(a));

		while (Math.pow(firstSquare, 2) <= b) {
			count++;
			firstSquare++;

		}

		System.out.println(count);
	}

}
