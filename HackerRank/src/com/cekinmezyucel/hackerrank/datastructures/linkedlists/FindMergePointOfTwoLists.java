package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class FindMergePointOfTwoLists {

	public static void main(String[] args) {
		Node headA = new Node(1, new Node(1, new Node(2, new Node(3, null))));
		Node headB = new Node(1, new Node(1, new Node(2, new Node(3, null))));

		System.out.println(FindMergeNode(headA, headB));
	}

	static int FindMergeNode(Node headA, Node headB) {
		Node currentA = headA;
		Node currentB = headB;

		while (currentA != currentB) {
			// currentA
			if (currentA.next == null) {
				currentA = headB;
			} else {
				currentA = currentA.next;
			}
			// currentB
			if (currentB.next == null) {
				currentB = headA;
			} else {
				currentB = currentB.next;
			}
		}
		return currentB.data;
	}

}
