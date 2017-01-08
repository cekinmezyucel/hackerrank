package com.cekinmezyucel.hackerrank.datastructures.trees;

import java.util.Scanner;

public class BinarySearchTreeInsertion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = Insert(root, data);
		}
		sc.close();
	}

	static Node Insert(Node root, int value) {
		if (root == null) {
			Node newRoot = new Node();
			newRoot.data = value;
			return newRoot;
		} else {
			Node cur;
			if (value <= root.data) {
				cur = Insert(root.left, value);
				root.left = cur;
			} else {
				cur = Insert(root.right, value);
				root.right = cur;
			}
		}

		return root;
	}
}
