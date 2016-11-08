package com.cekinmezyucel.hackerrank.datastructures.arrays;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int rotate;

		if (d > n) {
			if (n % d == 0) {
				rotate = 0;
			} else {
				rotate = n % d;
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
