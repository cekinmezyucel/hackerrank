package com.cekinmezyucel.hackerrank.datastructures.arrays;

import java.util.Scanner;

public class ArraysDS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		while (--n >= 0) {
			System.out.print(arr[n] + " ");
		}

		scan.close();
	}

}
