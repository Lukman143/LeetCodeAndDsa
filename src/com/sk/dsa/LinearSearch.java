package com.sk.dsa;

//LinearSearch means that finding element index in array
public class LinearSearch {

	static int linearSearch(int[] a, int key) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		int[] a = { 2, 4, 1, 3, 5, 6, 8, 7 };

		System.out.println(linearSearch(a, 1));
	}

}
