package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Long max = Long.MIN_VALUE;
		Long min = Long.MAX_VALUE;
		Long sum = 0l;

		for (int i = 0; i < 5; i++) {
			Long current = scan.nextLong();
			sum += current;

			if (current > max) {
				max = current;
			}

			if (current < min) {
				min = current;
			}
		}

		scan.close();

		System.out.println((sum - max) + " " + (sum - min));

	}

}
