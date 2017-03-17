package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CatsAndAMouse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();

		while (q-- > 0) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();

			if (Math.abs(x - z) == Math.abs(y - z)) {
				System.out.println("Mouse C");
			} else if (Math.abs(x - z) < Math.abs(y - z)) {
				System.out.println("Cat A");
			} else {
				System.out.println("Cat B");
			}
		}

		in.close();
	}

}
