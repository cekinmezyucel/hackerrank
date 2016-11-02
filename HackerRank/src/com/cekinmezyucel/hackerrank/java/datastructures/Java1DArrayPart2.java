package com.cekinmezyucel.hackerrank.java.datastructures;

import java.util.Scanner;

public class Java1DArrayPart2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = in.nextInt();
			}

			if (willIWin(a, m, 0)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

		in.close();
	}

	private static boolean willIWin(int[] a, int m, int i) {
		if (i < 0 || a[i] == 1) {
			return false;
		}

		if ((i == a.length - 1) || i + m > a.length - 1) {
			return true;
		}

		a[i] = 1;
		return willIWin(a, m, i + 1) || willIWin(a, m, i - 1) || willIWin(a, m, i + m);
	}

}
