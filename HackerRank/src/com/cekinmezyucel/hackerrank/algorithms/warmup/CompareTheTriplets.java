package com.cekinmezyucel.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();

		int[] a = new int[] { a0, a1, a2 };
		int[] b = new int[] { b0, b1, b2 };

		int scoreA = 0;
		int scoreB = 0;

		for (int i = 0; i < 3; i++) {
			if (a[i] > b[i]) {
				scoreA += 1;
			} else if (b[i] > a[i]) {
				scoreB += 1;
			}
		}

		System.out.println(scoreA + " " + scoreB);
		in.close();
	}

}
