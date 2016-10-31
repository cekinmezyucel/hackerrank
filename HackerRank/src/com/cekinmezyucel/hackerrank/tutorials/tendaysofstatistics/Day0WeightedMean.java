package com.cekinmezyucel.hackerrank.tutorials.tendaysofstatistics;

import java.util.Scanner;

public class Day0WeightedMean {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x[] = new int[n];
		double sumX = 0;
		double sumW = 0;

		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int w = scan.nextInt();
			sumX += (x[i] * w);
			sumW += w;
		}

		System.out.printf("%.1f\n", sumX / sumW);

		scan.close();
	}

}
