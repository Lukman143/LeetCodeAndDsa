package com.sk.dsa;

public class DeleteIndexNumber {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		int value = 3;

		int[] s = new int[a.length];

		for (int i = 0; i < a.length - 1; i++) {
			if (value == a[i]) {
				System.out.println("!!!!!!!!!!");
				s[i] = a[i + 1];
				value++;
			} else
				s[i] = a[i];
		}
		for (int k = 0; k < s.length - 1; k++) {
			System.out.println(s[k]);
		}
	}
}
