package com.cekinmezyucel.hackerrank.allcontests.weekofcode25;

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
			if (factor1(i, a) && factor2(i, b)) {
				count++;
			}
		}

		System.out.println(count);
		in.close();
	}

	static boolean factor1(int i, int[] a) {
		for (int j = 0; j < a.length; j++) {
			if (i % a[j] != 0) {
				return false;
			}
		}

		return true;
	}

	static boolean factor2(int i, int[] b) {
		for (int j = 0; j < b.length; j++) {
			if (b[j] % i != 0) {
				return false;
			}
		}

		return true;
	}

}
