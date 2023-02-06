package com.sk.dsa;

public class findingDublicateInArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 2, 4,4, 5, 1, 7 };
		int count = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
