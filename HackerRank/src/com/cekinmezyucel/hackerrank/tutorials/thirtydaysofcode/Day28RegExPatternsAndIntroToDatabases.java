package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day28RegExPatternsAndIntroToDatabases {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		List<String> userList = new ArrayList<>();

		while (t-- >= 0) {
			String user = scan.nextLine();
			if (user.contains("@gmail.com")) {
				String[] split = user.split(" ");
				userList.add(split[0]);
			}
		}
		scan.close();

		Collections.sort(userList);
		for (String username : userList) {
			System.out.println(username);
		}
	}

}