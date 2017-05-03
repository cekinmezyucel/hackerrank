package com.cekinmezyucel.hackerrank.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordCracker {

	static final String WRONG_PASSWORD = "WRONG PASSWORD";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();
			String[] arr = new String[n];

			for (int i = 0; i < n; i++) {
				arr[i] = in.next();
			}

			String passWord = in.next();
			List<String> hackList = new ArrayList<>();
			System.out.println(calculate(arr, passWord, hackList));
		}

		in.close();
	}

	static String calculate(String[] arr, String passWord, List<String> hackList) {
		if (passWord.length() == 0 && !hackList.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (String pass : hackList) {
				sb.append(pass).append(" ");
			}
			return sb.toString();
		} else {
			for (String pass : arr) {
				if (passWord.contains(pass)) {
					if (passWord.substring(0, pass.length()).equals(pass)) {
						String newPassword = passWord.replaceFirst(pass, "");
						hackList.add(pass);
						return calculate(arr, newPassword, hackList);
					}
				}
			}
			return WRONG_PASSWORD;
		}
	}

}
