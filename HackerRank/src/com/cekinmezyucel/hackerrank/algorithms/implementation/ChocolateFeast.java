package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();

			int piece = n / c;
			int wrapper = piece;

			while (wrapper >= m) {
				int newPiece = wrapper / m;
				piece += newPiece;
				wrapper = newPiece + (wrapper % m);
			}

			System.out.println(piece);
		}

		in.close();
	}

}
