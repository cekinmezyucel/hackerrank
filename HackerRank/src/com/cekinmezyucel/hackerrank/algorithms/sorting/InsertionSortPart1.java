package com.cekinmezyucel.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class InsertionSortPart1 {

	public static void insertIntoSorted(int[] ar) {
		int i = ar[ar.length - 1];
		int j;

		for (j = ar.length - 2; j >= 0; j--) {
			if (ar[j] > i) {
				ar[j + 1] = ar[j];
				printArray(ar);
			} else {
				break;
			}
		}
		ar[j + 1] = i;
		printArray(ar);
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
