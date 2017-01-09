package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

class TreeNode {
	TreeNode left, right;
	int data;

	TreeNode(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22BinarySearchTrees {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		TreeNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		int height = getHeight(root);
		System.out.println(height);
	}

	public static int getHeight(TreeNode root) {

		int heightLeft = 0;
		int heightRight = 0;

		if (root.left != null) {
			heightLeft = getHeight(root.left) + 1;
		}
		if (root.right != null) {
			heightRight = getHeight(root.right) + 1;
		}

		return (heightLeft > heightRight ? heightLeft : heightRight);

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

/*
 * testCase 7 3 5 2 1 4 6 7
 */
