package com.sk.array;

public class EvenDigits {

	public static void main(String[] args) {

		int[] a = { 12, 345, 2, 6, 7896 };

		int n = 0;

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			n = a[i];

			while (n != 0) {

				int rev = n % 10;
				count++;
				n = n / 10;
			}

			if (count % 2 == 0) {
				System.out.println(a[i] + "-----------------" + count);
				count = 0;
				n = 0;
			} else
				count = 0;
			n = 0;

		}

	}

}
