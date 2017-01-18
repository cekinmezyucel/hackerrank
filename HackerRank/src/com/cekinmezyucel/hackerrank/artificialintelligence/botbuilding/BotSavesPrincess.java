package com.cekinmezyucel.hackerrank.artificialintelligence.botbuilding;

import java.util.Scanner;

public class BotSavesPrincess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int mX = -1;
		int mY = -1;
		int pX = -1;
		int pY = -1;

		String grid[] = new String[m];
		for (int i = 0; i < m; i++) {
			grid[i] = scan.next();
			char[] chars = grid[i].toCharArray();
			for (int j = 0; j < m; j++) {
				if (chars[j] == 'm') {
					mX = i;
					mY = j;
				} else if (chars[j] == 'p') {
					pX = i;
					pY = j;
				}
			}
		}

		int difX = mX - pX;
		int difY = mY - pY;
		int absDifX = Math.abs(difX);
		int absDifY = Math.abs(difY);

		if (difX < 0) {
			while (absDifX-- > 0) {
				System.out.println("DOWN");
			}
		} else if (difX > 0) {
			while (absDifX-- > 0) {
				System.out.println("UP");
			}
		}

		if (difY < 0) {
			while (absDifY-- > 0) {
				System.out.println("RIGHT");
			}
		} else if (difY > 0) {
			while (absDifY-- > 0) {
				System.out.println("LEFT");
			}
		}

	}
}
