package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

public class Day10BinaryNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		char[] binaryN = Integer.toBinaryString(n).toCharArray();
		int maxConsecutive = Integer.MIN_VALUE;
		int tempConsecutive = 0;

		for (int i = 0; i < binaryN.length; i++) {
			if (binaryN[i] == '1') {
				tempConsecutive++;
			} else {
				tempConsecutive = 0;
			}
			if (tempConsecutive > maxConsecutive) {
				maxConsecutive = tempConsecutive;
			}
		}

		System.out.println(maxConsecutive);
		scan.close();
	}
}
