package com.cekinmezyucel.hackerrank.tutorials.crackingthecodinginterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class StacksBalancedBrackets {

	static Map<Character, Character> brackets = fillTheBrackets();

	static Map<Character, Character> fillTheBrackets() {
		Map<Character, Character> tmp = new HashMap<>();
		tmp.put('[', ']');
		tmp.put('(', ')');
		tmp.put('{', '}');

		return tmp;
	}

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			Character c = expression.charAt(i);

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

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			boolean answer = isBalanced(expression);
			if (answer)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
