package com.cekinmezyucel.hackerrank.artificialintelligence.botbuilding;

import java.util.Scanner;

public class BotCleanLarge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] pos = new int[2];

		for (int i = 0; i < 2; i++) {
			pos[i] = in.nextInt();
		}

		int h = in.nextInt();
		int w = in.nextInt();

		String board[] = new String[h];
		for (int i = 0; i < h; i++) {
			board[i] = in.next();
		}

		in.close();
		next_move(pos[0], pos[1], board);
	}

	static void next_move(int posX, int posY, String[] board) {

		int nearestDirtyPlaceDistance = Integer.MAX_VALUE;
		int nearestDirtyPlaceX = -1;
		int nearestDirtyPlaceY = -1;

		for (int x = 0; x < board.length; x++) {
			char[] chars = board[x].toCharArray();
			for (int y = 0; y < chars.length; y++) {
				if (chars[y] == 'd') {
					if (posX == x && posY == y) {
						System.out.println("CLEAN");
						return;
					} else {
						int absDifX = Math.abs(posX - x);
						int absDifY = Math.abs(posY - y);

						if ((absDifX + absDifY) < nearestDirtyPlaceDistance) {
							nearestDirtyPlaceDistance = absDifX + absDifY;
							nearestDirtyPlaceX = x;
							nearestDirtyPlaceY = y;
						}
					}
				}
			}
		}

		int difX = posX - nearestDirtyPlaceX;
		int difY = posY - nearestDirtyPlaceY;

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
