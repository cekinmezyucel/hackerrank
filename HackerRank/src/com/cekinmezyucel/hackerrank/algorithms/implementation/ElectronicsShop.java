package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class ElectronicsShop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int spentMaxPrice = 0;

		int[] keyboards = new int[n];

		for (int i = 0; i < n; i++) {
			keyboards[i] = in.nextInt();
		}

		while (m-- > 0) {
			int usb = in.nextInt();

			for (int keyboard : keyboards) {
				int sum = keyboard + usb;
				if (sum > spentMaxPrice && sum <= s) {
					spentMaxPrice = sum;
				}
			}
		}
		in.close();
		System.out.println(spentMaxPrice == 0 ? -1 : spentMaxPrice);
	}

}
