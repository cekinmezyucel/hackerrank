package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class SequenceEquation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n+1];
		for (int i = 1; i <= n; i++) {
			int x = in.nextInt();
			a[x] = i;
		}
		in.close();
		
		for(int y=1; y<=n; y++) {
			System.out.println(a[a[y]]);
		}
	}

}
