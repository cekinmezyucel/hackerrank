package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int s = in.nextInt();
			warnThePrisoner(n, m, s);
		}

		in.close();
	}

	static void warnThePrisoner(int prisoner, int candy, int index) {
		int candyX = candy + index - 1;
		System.out.println((candyX % prisoner) == 0 ? prisoner : (candyX % prisoner));
	}

}
