package com.cekinmezyucel.hackerrank.allcontests.weekofcode26;

import java.util.Scanner;

public class MusicOnTheStreet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] coords = new int[n];
		for (int i = 0; i < n; i++) {
			coords[i] = in.nextInt();
		}
		int total = in.nextInt();
		int hmin = in.nextInt();
		int hmax = in.nextInt();

		in.close();

		int sumCoords = 0;
		int startPoint = -1;
		for (int i = 0; i < coords.length - 1; i++) {
			int genre = coords[i + 1] - coords[i];
			if (genre >= hmin && genre <= hmax) {
				sumCoords += coords[i + 1] - coords[i];
				if (startPoint == -1) {
					startPoint = coords[i];
				}
			}
		}

		if (coords.length == 1) {
			System.out.println(coords[0] - hmin);
			return;
		}

		int differWalk = total - sumCoords;

		if (differWalk == 0) {
			System.out.println(startPoint);
			return;
		} else if ((differWalk - hmin) >= hmin && (differWalk - hmin) <= hmax) {
			System.out.println(startPoint - hmin);
		} else {
			System.out.println(startPoint - hmax);
		}
	}

}
