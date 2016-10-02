package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];

		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}

		int energy = 100;
		int jumps = (n / k) - 1;
		int cloud = 0;

		while (jumps-- > 0) {
			if (c[cloud + k] == 0) {
				energy -= 1;
				cloud += k;
			} else {
				energy -= 3;
				cloud += k;
			}
		}

		if (c[0] == 1) {
			energy -= 3;
		} else {
			energy -= 1;
		}

		System.out.println(energy);
	}

}
