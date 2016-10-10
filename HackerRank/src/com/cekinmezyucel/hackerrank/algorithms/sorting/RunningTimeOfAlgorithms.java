package com.cekinmezyucel.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {

	public static void insertionSortPart2(int[] ar) {

		int shift = 0;

		for (int i = 0; i < ar.length - 1; i++) {
			int j = i + 1;
			while (j > 0) {
				if (ar[j] < ar[j - 1]) {
					int temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
					j--;
					shift += 1;
				} else {
					break;
				}
			}
		}
		System.out.println(shift);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);

	}

}
