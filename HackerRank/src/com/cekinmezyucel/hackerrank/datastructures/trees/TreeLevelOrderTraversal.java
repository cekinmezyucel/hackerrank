package com.cekinmezyucel.hackerrank.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeLevelOrderTraversal {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		levelOrder(root);
	}

	private static void levelOrder(Node root) {
		Queue<Node> levelQueue = new LinkedList<>();
		levelQueue.add(root);

		while (!levelQueue.isEmpty()) {

			Node currentNode = levelQueue.poll();
			System.out.printf(currentNode.data + " ");

			if (null != currentNode.left) {
				levelQueue.add(currentNode.left);
			}
			if (null != currentNode.right) {
				levelQueue.add(currentNode.right);
			}
		}
	}

	private static Node insert(Node root, int data) {
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
