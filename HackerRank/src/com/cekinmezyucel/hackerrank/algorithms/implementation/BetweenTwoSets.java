package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}

		int count = 0;

		for (int i = 1; i <= 100; i++) {
			boolean factorsOfi = true;
			boolean bValueFactor = true;
			for (int aValue : a) {
				if (i % aValue != 0) {
					factorsOfi = false;
					break;
				}
			}

			for (int bValue : b) {
				if (bValue % i != 0) {
					bValueFactor = false;
					break;
				}
			}

			if (factorsOfi && bValueFactor) {
				count++;
			}
		}

		System.out.println(count);
	}
}

/*
 * Sample Input
 * 2 3
 * 2 4
 * 16 32 96
 * Sample Output
 * 3
 */
