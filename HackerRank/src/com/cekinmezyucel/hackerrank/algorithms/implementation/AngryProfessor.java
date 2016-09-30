package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int goodBoys = 0;

			for (int j = 0; j < n; j++) {
				if (scan.nextInt() <= 0) {
					goodBoys += 1;
				}
			}
			if (goodBoys >= k) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

		scan.close();
	}

}
