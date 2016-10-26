package com.cekinmezyucel.hackerrank.datastructures.arrays;

import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String a[] = new String[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.next();
		}

		int q = scan.nextInt();

		for (int j = 0; j < q; j++) {
			int count = 0;
			String search = scan.next();

			for (int k = 0; k < a.length; k++) {
				if (search.equals(a[k])) {
					count++;
				}
			}

			System.out.println(count);
		}

		scan.close();
	}

}
