package com.cekinmezyucel.hackerrank.java.advanced;

import java.security.MessageDigest;
import java.util.Scanner;

public class JavaMD5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strValue = sc.next();

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(strValue.getBytes("UTF-8"));
			System.out.println(String.format("%032x", new java.math.BigInteger(1, md.digest())));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
