package com.cekinmezyucel.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int v = scan.nextInt();
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			if (v == scan.nextInt()) {
				System.out.println(i);
			}
		}
		scan.close();
	}

}
