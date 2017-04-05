package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		int d = in.nextInt();
		int m = in.nextInt();
		in.close();

		for (int i = 0; i < arr.length - m + 1; i++) {
			int sum = 0;
			int x = i;
			int a = m;
			while (a-- > 0) {
				sum += arr[x];
				x++;
			}

			if (sum == d) {
				count++;
			}
		}

		System.out.println(count);
	}

}
