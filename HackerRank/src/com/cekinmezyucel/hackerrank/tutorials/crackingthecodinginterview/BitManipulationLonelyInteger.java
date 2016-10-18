package com.cekinmezyucel.hackerrank.tutorials.crackingthecodinginterview;

import java.util.Scanner;

public class BitManipulationLonelyInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int value = 0;
		for (int a_i = 0; a_i < n; a_i++) {
			value ^= in.nextInt();
		}

		System.out.println(value);
		in.close();
	}

}
