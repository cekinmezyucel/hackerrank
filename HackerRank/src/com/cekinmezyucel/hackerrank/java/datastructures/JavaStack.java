package com.cekinmezyucel.hackerrank.java.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
	static Map<Character, Character> brackets = new HashMap<>();

	public static void main(String[] args) {
		brackets.put('[', ']');
		brackets.put('(', ')');
		brackets.put('{', '}');

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(isValid(input));
		}

		sc.close();
	}

	private static boolean isValid(String input) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);

			if (brackets.containsKey(c)) {
				stack.push(c);
			} else if (brackets.containsValue(c) && !stack.isEmpty()) {
				Character m = brackets.get(stack.pop());
				if (!m.equals(c)) {
					return false;
				}
			} else {
				return false;
			}
		}

		return stack.isEmpty();
	}

}
