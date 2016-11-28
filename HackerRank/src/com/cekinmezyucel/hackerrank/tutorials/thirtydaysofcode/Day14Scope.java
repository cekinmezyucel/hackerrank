package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] elements) {
		super();
		this.elements = elements;
	}

	public void computeDifference() {
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;

		for (int element : elements) {
			if (element > maxValue) {
				maxValue = element;
			}

			if (element < minValue) {
				minValue = element;
			}
		}

		this.maximumDifference = Math.abs(maxValue - minValue);
	}
}

public class Day14Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}

}
