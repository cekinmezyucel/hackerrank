package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class CompareTwoLinkedLists {
	public static void main(String[] args) {
		Node headA = new Node(1, new Node(2, new Node(3, new Node(4, null))));
		Node headB = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));

		System.out.println(CompareLists(headA, headB));
	}

	// This is the code
	static int CompareLists(Node headA, Node headB) {
		if (null == headA && null == headB) {
			return 1;
		} else if (null == headA || null == headB) {
			return 0;
		} else if (headA.data != headB.data) {
			return 0;
		} else {
			return CompareLists(headA.next, headB.next);
		}
	}
}
