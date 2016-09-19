package com.cekinmezyucel.hackerrank.java.datastructures;

import java.util.Scanner;

public class Java2DArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		printLargestSum(arr);
	}

	private static void printLargestSum(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i > 1 && j > 1) {
					int sum = arr[i][j] + arr[i][j - 1] + arr[i][j - 2] + arr[i - 1][j - 1] + arr[i - 2][j]
							+ arr[i - 2][j - 1] + arr[i - 2][j - 2];
					if (sum > maxSum) {
						maxSum = sum;
					}
				}
			}
		}

		System.out.println(maxSum);
	}

}