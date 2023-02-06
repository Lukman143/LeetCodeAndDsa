package com.sk.dsa;

public class FindCountEeachElement {
	public static void main(String[] args) {

		int[] a = { 1, 2, 1, 1, 3, 4, 4, 5 };//

		int count = 1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						a[j] = 0;
					}
				}
				System.out.println(a[i] + "---" + count);
				count = 1;
			}
		}

	}
}
