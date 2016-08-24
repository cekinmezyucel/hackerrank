package com.cekinmezyucel.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");

		for (int i = 0; i < 3; i++) {
			String s = sc.next();
			int x = sc.nextInt();
			String y = String.valueOf(x);

			if (s.length() < 15) {
				int justify = 15 - s.length();
				for (int f = 0; f < justify; f++) {
					s = s + " ";
				}
			}

			if (String.valueOf(y).length() < 3) {
				int justify2 = 3 - y.length();
				for (int j = 0; j < justify2; j++) {
					y = "0" + y;
				}
			}

			System.out.println(s + y);
		}
		System.out.println("================================");

		sc.close();
	}

}
