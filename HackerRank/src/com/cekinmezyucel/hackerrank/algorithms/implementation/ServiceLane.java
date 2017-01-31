package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		while (t-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();

			int min = Integer.MAX_VALUE;
			for (int i = a; i <= b; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}

			System.out.println(min);
		}

		in.close();
	}

}
