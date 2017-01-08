package com.cekinmezyucel.hackerrank.datastructures.trees;

import java.util.Scanner;

public class TreeTopView {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		top_view(root);
	}

	public static void top_view(Node root) {

		if (null == root) {
			return;
		}

		if (root.left != null) {
			root.left.right = null;
			top_view(root.left);
		}
		System.out.printf(root.data + " ");

		if (root.right != null) {
			root.right.left = null;
			top_view(root.right);

		}
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
