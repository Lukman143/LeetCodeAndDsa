package com.sk.array;

public class Loop {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			System.out.println(i);

			if (i == 5) {
				for (int j = i; j >= 1; j--) {

					System.out.println(j);

				}
			}
		}
	}

}
