package com.sk.array;

public class LeetCode744 {
	/*
	 * public static void main(String[] args) {
	 * 
	 * char[] a = { 'c', 'f', 'j' }; char tar = 'g';
	 * System.out.println(nextGreatestLetter(a, tar));
	 * 
	 * }
	 * 
	 * public static char nextGreatestLetter(char[] letters, char target) {
	 * 
	 * int start = 0;//
	 * 
	 * int end = letters.length - 1;
	 * 
	 * while (start <= end) {
	 * 
	 * int mid = (start + end) / 2;
	 * 
	 * if (target < letters[mid]) { end = mid - 1; } else { start = mid + 1; }
	 * 
	 * }
	 * 
	 * return letters[start % letters.length]; }
	 */

	public static void main(String[] args) {

		char[] a = { 'c', 'f', 'j' };
		char tar = 'g';
		System.out.println(nextGreatestLetter(a, tar));

	}

	public static char nextGreatestLetter(char[] letters, char target) {

		int start = 0;

		int end = letters.length - 1;

		int k = 0;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (target < letters[mid]) {
				end = mid - 1;

			} else {
				start = mid + 1;
			}
		}

		if (k == 0) {

			char m = 122;

			for (int i = 0; i < letters.length; i++) {

				if (target <= letters[i]) {

					k = i;

					for (int j = i; j < letters.length; j++) {

						if (m > letters[j]) {
							m = letters[j];
							k = j;
						}
					}
					return letters[k];
				}
			}
		}
		return letters[k];
	}
}
