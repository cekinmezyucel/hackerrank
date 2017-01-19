package com.cekinmezyucel.hackerrank.artificialintelligence.botbuilding;

import java.util.Scanner;

public class BotSavesPrincess2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, r, c;
		n = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();
		String grid[] = new String[n];

		for (int i = 0; i < n; i++) {
			grid[i] = in.next();
		}

		in.close();
		nextMove(n, r, c, grid);
	}

	static void nextMove(int n, int r, int c, String[] grid) {

		int pX = -1;
		int pY = -1;

		for (int i = 0; i < n; i++) {
			char[] chars = grid[i].toCharArray();
			for (int j = 0; j < n; j++) {
				if (chars[j] == 'p') {
					pX = i;
					pY = j;
				}
			}
		}

		int difX = r - pX;
		int difY = c - pY;

		if (difX < 0) {
			System.out.println("DOWN");
			return;
		} else if (difX > 0) {
			System.out.println("UP");
			return;
		}

		if (difY < 0) {
			System.out.println("RIGHT");
			return;
		} else if (difY > 0) {
			System.out.println("LEFT");
			return;
		}
	}
}
