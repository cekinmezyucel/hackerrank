package com.cekinmezyucel.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Long sum = 0l;

		for (int i = 0; i < n; i++) {
			sum += scan.nextLong();
		}

		System.out.println(sum);
		scan.close();
	}

}
