package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class LisasWorkbook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int chapter = in.nextInt();
		int maxQ = in.nextInt();
		int specialQ = 0;
		int page = 1;

		while (chapter-- > 0) {
			int questions = in.nextInt();

			for (int i = 1; i <= questions; i++) {

				if (i == page) {
					specialQ++;
				}

				if (i % maxQ == 0) {
					page++;
				}

			}

			if (questions % maxQ != 0) {
				page++;
			}
		}
		in.close();
		System.out.println(specialQ);

		// de
	}

}
