package com.sk.dsa;

public class InsertIndexInArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };

		int[] s = new int[a.length + 1];

		int index = 3;
		int value = 20;

		for (int k = 0, J = 0; k < s.length; k++, J++) {

			if (k == index) {
				s[k] = value;
				k++;
			}
			s[k] = a[J];
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

}