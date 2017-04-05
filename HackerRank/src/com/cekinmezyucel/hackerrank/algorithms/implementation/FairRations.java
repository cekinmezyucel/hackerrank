package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class FairRations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int sumArr = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int v = in.nextInt();
			arr[i] = v;
			sumArr += v;
		}

		in.close();

		if (sumArr % 2 != 0) {
			System.out.println("NO");
		} else {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] % 2 != 0) {
					arr[i] = arr[i] + 1;
					arr[i + 1] = arr[i + 1] + 1;
					count += 2;
				}
			}

			System.out.println(count);
		}

	}

}
