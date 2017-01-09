package com.cekinmezyucel.hackerrank.datastructures.trees;

import java.util.Scanner;

public class BinarySearchTreeLowestCommonAncestor {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		Node lca = lca(root, 2, 1);
		System.out.println(lca.data);
	}

	static Node lca(Node root, int v1, int v2) {
		if (root.data < v1 && root.data < v2) {
			return lca(root.right, v1, v2);
		} else if (root.data > v1 && root.data > v2) {
			return lca(root.left, v1, v2);
		} else {
			return root;
		}
	}

	static Node insert(Node root, int data) {
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

/*
 * testCase 7 3 5 2 1 4 6 7
 */
