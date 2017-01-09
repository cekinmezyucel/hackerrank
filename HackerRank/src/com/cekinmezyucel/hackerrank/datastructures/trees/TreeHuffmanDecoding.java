package com.cekinmezyucel.hackerrank.datastructures.trees;

class HuffmanTree {
	int freq;
	char data;
	HuffmanTree left;
	HuffmanTree right;

	public HuffmanTree(int freq, char data, HuffmanTree left, HuffmanTree right) {
		super();
		this.freq = freq;
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public HuffmanTree() {
		super();
	}
}

public class TreeHuffmanDecoding {
	public static void main(String[] args) {
		// HuffmanTree root = new HuffmanTree(5, 'Z', left0, right0);
		// HuffmanTree left0 = new HuffmanTree(2, 'Z', left1, right1);
	}

	static void decode(String S, HuffmanTree root) {

		StringBuilder sb = new StringBuilder();
		HuffmanTree c = root;

		for (int i = 0; i < S.length(); i++) {
			char cha = S.charAt(i);
			if (cha == '1') {
				c = c.right;
			} else {
				c = c.left;
			}

			if (null == c.right && null == c.left) {
				sb.append(c.data);
				c = root;
			}
		}

		System.out.println(sb);

	}
}
