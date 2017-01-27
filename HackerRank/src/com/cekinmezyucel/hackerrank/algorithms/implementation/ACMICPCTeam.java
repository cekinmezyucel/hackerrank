package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACMICPCTeam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<char[]> list = new ArrayList<>();
		int teamMaxKnowledge = Integer.MIN_VALUE;
		int bestTeams = 0;
		in.nextLine();

		for (int y = 0; y < n; y++) {
			char[] charArray = in.nextLine().toCharArray();
			list.add(charArray);
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				char[] t1 = list.get(i).clone();
				char[] t2 = list.get(j).clone();

				int currentKnowledge = 0;
				for (int k = 0; k < m; k++) {
					char a = t1[k];
					char b = t2[k];

					if (a == '1' || b == '1') {
						currentKnowledge++;
					}
				}

				if (currentKnowledge > teamMaxKnowledge) {
					teamMaxKnowledge = currentKnowledge;
					bestTeams = 1;
				} else if (currentKnowledge == teamMaxKnowledge) {
					bestTeams++;
				}
			}
		}
		in.close();
		System.out.println(teamMaxKnowledge);
		System.out.println(bestTeams);

	}

}
