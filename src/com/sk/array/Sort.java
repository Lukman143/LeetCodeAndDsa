package com.sk.array;

public class Sort {

	public static void main(String[] args) {

		int[] a = { 6, 5, 4, 3, 2, 1 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			break;

		}
		
		for(int x:a) {
			System.out.println(x);
		}

	}
}
