package com.sk.array;

import java.util.Arrays;

public class MaxWealth {
	public static void main(String[] args) {

		int sum = 0;
		int[] arr = new int[3];

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int r = 0; r < a.length; r++) {
			
			for (int c = 0; c < a[r].length; c++) {
				sum += a[r][c];
				arr[r] = sum;
			}
			sum = 0;

		}

		System.out.println(Arrays.toString(arr));

		int max = Integer.MIN_VALUE;
		for (int k = 0; k < arr.length; k++) {

			if (max < arr[k]) {
				max = arr[k];
			}
		}
		System.out.println(max);
	}
}
