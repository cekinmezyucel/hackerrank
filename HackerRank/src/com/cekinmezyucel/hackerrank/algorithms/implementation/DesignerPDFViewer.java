package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 26;
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = in.nextInt();
		}
		String word = in.next();
		in.close();

		int tallestLetter = Integer.MIN_VALUE;
		for (int i = 0; i < word.length(); i++) {
			int letterSeq = (int) word.charAt(i);
			if (letterSeq >= 97 && letterSeq <= 122 && tallestLetter < h[letterSeq - 97]) {
				tallestLetter = h[letterSeq - 97];
			}
		}

		System.out.println(word.length() * tallestLetter);
	}

}
