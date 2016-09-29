package com.cekinmezyucel.hackerrank.java.advanced;

import java.security.MessageDigest;
import java.util.Scanner;

public class JavaSHA256 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strValue = sc.next();

		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(strValue.getBytes("UTF-8"));
			System.out.println(String.format("%064x", new java.math.BigInteger(1, md.digest())));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
