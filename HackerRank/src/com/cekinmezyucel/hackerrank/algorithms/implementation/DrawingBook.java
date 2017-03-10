package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pageSize = in.nextInt();
		int targetPage = in.nextInt();
		in.close();
		System.out.println(calculate(pageSize, targetPage));
	}

	static int calculate(int pageSize, int targetPage) {

		int fromBegin = calculateFromBegin(targetPage);
		int fromEnd = calculateFromEnd(pageSize, targetPage);

		return fromBegin > fromEnd ? fromEnd : fromBegin;
	}

	static int calculateFromBegin(int targetPage) {
		return targetPage / 2;
	}

	static int calculateFromEnd(int pageSize, int targetPage) {
		if (pageSize % 2 == 0) {
			return (pageSize - targetPage + 1) / 2;
		} else {
			return (pageSize - targetPage) / 2;
		}
	}

}
