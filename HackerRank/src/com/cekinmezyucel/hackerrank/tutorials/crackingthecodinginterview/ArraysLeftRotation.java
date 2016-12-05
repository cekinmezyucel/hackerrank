package com.cekinmezyucel.hackerrank.tutorials.crackingthecodinginterview;

import java.util.Scanner;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int rotate;

		if (d >= n) {
			if (d % n == 0) {
				rotate = 0;
			} else {
				rotate = d % n;
			}
		} else {
			rotate = d;
		}

		if (rotate != 0) {
			int dArr[] = new int[d];

			for (int i = 0; i < d; i++) {
				dArr[i] = scan.nextInt();
			}

			for (int j = 0; j < n - d; j++) {
				System.out.print(scan.nextInt() + " ");
			}

			for (int k = 0; k < d; k++) {
				System.out.print(dArr[k] + " ");
			}

		} else {
			for (int i = 0; i < n; i++) {
				System.out.print(scan.nextInt() + " ");
			}
		}

		scan.close();
	}

}
