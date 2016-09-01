package com.cekinmezyucel.hackerrank.java.advanced;

import java.util.Scanner;

class Singleton {

	public String str;

	private Singleton() {
	}

	private static Singleton instance = new Singleton();

	public static Singleton getSingleInstance() {
		return instance;
	}

}

public class JavaSingleton {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strValue = sc.next();

		Singleton s1 = Singleton.getSingleInstance();
		s1.str = strValue;

		System.out.println("Hello I am a singleton! Let me say " + Singleton.getSingleInstance().str + " to you");
	}

}
