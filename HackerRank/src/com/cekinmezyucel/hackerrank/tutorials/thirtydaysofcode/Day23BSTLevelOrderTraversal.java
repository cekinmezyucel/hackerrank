package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23BSTLevelOrderTraversal {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		TreeNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		levelOrder(root);
	}

	private static void levelOrder(TreeNode root) {
		Queue<TreeNode> levelQueue = new LinkedList<>();
		levelQueue.add(root);

		while (!levelQueue.isEmpty()) {

			TreeNode currentNode = levelQueue.poll();
			System.out.printf(currentNode.data + " ");

			if (null != currentNode.left) {
				levelQueue.add(currentNode.left);
			}
			if (null != currentNode.right) {
				levelQueue.add(currentNode.right);
			}
		}
	}

	private static TreeNode insert(TreeNode root, int data) {
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
