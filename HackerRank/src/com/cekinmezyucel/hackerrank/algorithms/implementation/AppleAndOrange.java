package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int appleHit = 0;
		int orangeHit = 0;

		for (int apple_i = 0; apple_i < m; apple_i++) {
			int fall = a + in.nextInt();
			if (fall >= s && fall <= t) {
				appleHit++;
			}
		}

		for (int orange_i = 0; orange_i < n; orange_i++) {
			int fall = b + in.nextInt();
			if (fall >= s && fall <= t) {
				orangeHit++;
			}
		}

		System.out.println(appleHit);
		System.out.println(orangeHit);

		in.close();
	}

}
