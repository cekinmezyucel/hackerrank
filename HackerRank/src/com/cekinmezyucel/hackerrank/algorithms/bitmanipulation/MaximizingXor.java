package com.cekinmezyucel.hackerrank.algorithms.bitmanipulation;

import java.util.Scanner;

public class MaximizingXor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int r = scan.nextInt();
		int max = Integer.MIN_VALUE;

		for (int i = l; i <= r; i++) {
			for (int j = l; j <= r; j++) {
				if ((i ^ j) > max) {
					max = (i ^ j);
				}
			}
		}

		System.out.println(max);
	}

}
