package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			printHeight(n);
		}
	}

	static void printHeight(int n) {
		int h = 1;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				h += 1;
			} else {
				h *= 2;
			}
		}

		System.out.println(h);
	}

}
