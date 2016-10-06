package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class MinimumDistances {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}

		int minimumDistance = Integer.MAX_VALUE;
		boolean isAnyPair = false;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (A[i] == A[j] && i != j) {
					isAnyPair = true;
					if (Math.abs(i - j) < minimumDistance) {
						minimumDistance = Math.abs(i - j);
					}
				}
			}
		}

		System.out.println(isAnyPair ? minimumDistance : -1);
	}

}
