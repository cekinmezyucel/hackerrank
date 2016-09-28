package com.cekinmezyucel.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sharp = 1;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - sharp; j++) {
				System.out.printf(" ");
			}
			for (int k = 0; k < sharp; k++) {
				System.out.printf("#");
			}
			System.out.println();
			sharp += 1;
		}
		scan.close();

	}

}
