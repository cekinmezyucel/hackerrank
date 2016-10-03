package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int anna = 0;
		int annaBill = 0;

		for (int i = 0; i < n; i++) {
			int price = scan.nextInt();
			if (!(i == k)) {
				anna += price;
			}
		}

		annaBill = scan.nextInt();

		if (anna / 2 == annaBill) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(annaBill - anna / 2);
		}

		scan.close();
	}

}
