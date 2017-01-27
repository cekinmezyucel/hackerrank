package com.cekinmezyucel.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		for (int j = 0; j < q; j++) {
			int cur = in.nextInt();
			if (k % n == 0) {
				System.out.println(arr[cur]);
			} else {
				System.out.println(arr[(n - (k % n) + cur) % n]);
			}
		}

		in.close();
	}

}
