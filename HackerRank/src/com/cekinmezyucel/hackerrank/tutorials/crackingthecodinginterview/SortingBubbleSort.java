package com.cekinmezyucel.hackerrank.tutorials.crackingthecodinginterview;

import java.util.Scanner;

public class SortingBubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		boolean isSorted = false;
		int theLastElement = arr.length - 1;
		int swapTime = 0;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < theLastElement; i++) {
				if (arr[i] > arr[i + 1]) {
					isSorted = false;
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapTime += 1;
				}

			}
			theLastElement--;
		}

		System.out.println("Array is sorted in " + swapTime + " swaps.");
		System.out.println("First Element: " + arr[0]);
		System.out.println("Last Element: " + arr[n - 1]);

	}
}
