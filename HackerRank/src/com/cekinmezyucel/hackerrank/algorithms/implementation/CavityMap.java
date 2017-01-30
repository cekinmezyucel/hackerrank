package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		char[][] charArr = new char[n][n];
		for (int i = 0; i < n; i++) {
			charArr[i] = in.next().toCharArray();
		}

		in.close();

		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				if (charArr[i][j] > charArr[i][j - 1] && charArr[i][j] > charArr[i][j + 1]
						&& charArr[i][j] > charArr[i - 1][j] && charArr[i][j] > charArr[i + 1][j]) {
					charArr[i][j] = 'X';
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(charArr[i]);
		}

	}

}
