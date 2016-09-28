package com.cekinmezyucel.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[][] array = new int[n][n];
		Integer primaryDiagonal = 0;
		Integer secondaryDiagonal = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = scan.nextInt();

				if (i == j) {
					primaryDiagonal += array[i][j];
				}

				if (i + j == n - 1) {
					secondaryDiagonal += array[i][j];
				}
			}
		}

		System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
		scan.close();
	}

}
