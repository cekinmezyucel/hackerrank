package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}

		int cloud = 0;
		int jump = 0;

		while (!(cloud == n - 1)) {
			if (((cloud + 2) <= (n - 1)) && c[cloud + 2] == 0) {
				cloud += 2;
				jump += 1;
			} else {
				cloud += 1;
				jump += 1;
			}
		}

		System.out.println(jump);
		in.close();

	}

}
