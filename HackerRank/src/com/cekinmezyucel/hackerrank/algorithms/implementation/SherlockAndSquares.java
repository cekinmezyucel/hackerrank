package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();

			double first = Math.ceil(Math.sqrt(a));
			double last = Math.floor(Math.sqrt(b));

			System.out.println((int) (last - first + 1));

		}

		in.close();
	}

}
