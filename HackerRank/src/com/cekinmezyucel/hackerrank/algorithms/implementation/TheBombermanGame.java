package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class TheBombermanGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int n = in.nextInt();

		char[][] firstState = new char[r][c];
		in.nextLine();
		for (int i = 0; i < r; i++) {
			firstState[i] = in.next().toCharArray();
		}

		in.close();

		switch (n % 4) {
		case 0:
			printAllBomb(r, c);
			break;
		case 1:
			printFirstState(r, c, firstState);
			break;
		case 2:
			printAllBomb(r, c);
			break;
		case 3:
			printCalculate(r, c, firstState);
			break;
		default:
			break;
		}

	}

	static void printAllBomb(int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(Character.toChars(79));
			}
			System.out.println("");
		}
	}

	static void printFirstState(int r, int c, char[][] firstState) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(firstState[i][j]);
			}
			System.out.println("");
		}
	}

	static void printCalculate(int r, int c, char[][] firstState) {

	}

}
