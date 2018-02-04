package com.cekinmezyucel.hackerrank.java.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.cekinmezyucel.hackerrank.java.advanced.JavaLambdaExpressions.PerformOperation;

class MyMath {

	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public static PerformOperation isOdd() {
		return num -> num % 2 != 0;
	}

	public static PerformOperation isEven() {
		return num -> num % 2 == 0;
	}

	public static PerformOperation isPrime() {
		return num -> {
			{
				if (num < 2)
					return false;
				if (num == 2)
					return true;
				if (num % 2 == 0)
					return false;
				for (int i = 3; i * i <= num; i += 2)
					if (num % i == 0)
						return false;
				return true;
			}
		};
	}

	public static PerformOperation isPalindrome() {
		return num -> {
			String intStr = String.valueOf(num);
			return intStr.equals(new StringBuilder(intStr).reverse().toString());
		};
	}

}

public class JavaLambdaExpressions {

	interface PerformOperation {
		boolean check(int a);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = MyMath.isOdd();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = MyMath.isPrime();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = MyMath.isPalindrome();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}

}
