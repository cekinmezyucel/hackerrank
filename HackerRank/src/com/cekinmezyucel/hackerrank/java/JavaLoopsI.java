package com.cekinmezyucel.hackerrank.java;

import java.util.Scanner;

public class JavaLoopsI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		loopsI(N);
		in.close();
	}

	public static void loopsI(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}

}
