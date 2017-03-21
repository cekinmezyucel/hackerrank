package com.cekinmezyucel.hackerrank.datastructures.arrays;

import java.util.Scanner;

public class AlgorithmicCrush {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long op = in.nextLong();
		long max = 0;
		long sum = 0;

		long[] arr = new long[n + 2];

		while (op-- > 0) {
			int start = in.nextInt();
			int end = in.nextInt();
			long add = in.nextLong();

			arr[start] += add;
			arr[end + 1] -= add;

		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			max = Math.max(max, sum);
		}

		in.close();
		System.out.println(max);
	}

}
