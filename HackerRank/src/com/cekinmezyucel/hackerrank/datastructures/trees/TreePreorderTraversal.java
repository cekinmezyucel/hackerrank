package com.cekinmezyucel.hackerrank.datastructures.trees;

import java.util.Scanner;

class TreeNode {
	TreeNode left, right;
	int data;

	TreeNode(int data) {
		this.data = data;
		left = right = null;
	}
}

public class TreePreorderTraversal {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		TreeNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		preOrder(root);
	}

	public static void preOrder(TreeNode root) {

		if (null == root) {
			return;
		}

		System.out.printf(root.data + " ");

		preOrder(root.left);
		preOrder(root.right);

	}

	public static TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		} else {
			TreeNode cur;
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
