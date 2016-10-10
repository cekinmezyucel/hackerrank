package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		int start = Math.abs(x1 - x2);
		int now = 0;

		while (now < start) {
			x1 += v1;
			x2 += v2;
			now = Math.abs(x1 - x2);
			if (x1 == x2) {
				System.out.println("YES");
				return;
			}
		}

		System.out.println("NO");
	}

}
