package com.sk.array;

public class RoatedBinaryArray {
	public static void main(String[] args) {

		int[] a = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 7;

		boolean b = true;
		// Output: 4
		for (int i = 0; i < a.length; i++) {
			if (target == a[i]) {
				b = false;
				System.out.println("----" + i);
				break;
			}

		}
		if (b) {
			System.out.println("----");

		}

	}
}
