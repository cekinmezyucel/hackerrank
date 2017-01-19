package com.cekinmezyucel.hackerrank.artificialintelligence.botbuilding;

import java.util.Scanner;

public class BotCleanStochastic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] pos = new int[2];
		String board[] = new String[5];

		for (int i = 0; i < 2; i++) {
			pos[i] = in.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			board[i] = in.next();
		}

		in.close();
		next_move(pos[0], pos[1], board);
	}

	static void next_move(int posX, int posY, String[] board) {

		int dX = -1;
		int dY = -1;

		for (int x = 0; x < 5; x++) {
			char[] chars = board[x].toCharArray();
			for (int y = 0; y < 5; y++) {
				if (chars[y] == 'd') {
					if (posX == x && posY == y) {
						System.out.println("CLEAN");
						return;
					} else {
						dX = x;
						dY = y;
						break;
					}
				}
			}
		}

		int difX = posX - dX;
		int difY = posY - dY;

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
