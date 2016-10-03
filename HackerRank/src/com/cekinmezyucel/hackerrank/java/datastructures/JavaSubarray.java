package com.cekinmezyucel.hackerrank.java.datastructures;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];

		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += c[j];
				if (sum < 0) {
					count++;
				}
			}
		}

		System.out.println(count);
		in.close();
	}

}
