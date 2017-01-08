package com.cekinmezyucel.hackerrank.datastructures.trees;

import java.util.Scanner;

public class TreeHeightOfABinaryTree {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		int height = height(root);
		System.out.println(height);
	}

	public static int height(Node root) {

		int heightLeft = 0;
		int heightRight = 0;

		if (root.left != null) {
			heightLeft = height(root.left) + 1;
		}
		if (root.right != null) {
			heightRight = height(root.right) + 1;
		}

		return (heightLeft > heightRight ? heightLeft : heightRight);

	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

}
