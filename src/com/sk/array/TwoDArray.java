package com.sk.array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		int[][] a = new int[3][3];
		Scanner sc = new Scanner(System.in);

		//int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		//System.out.println(a.length);

		for (int r = 0; r < a.length; r++) {

			for (int c = 0; c < a[r].length; c++) {

				a[r][c] = sc.nextInt();
			}
		}

		for (int r = 0; r < a.length; r++) {

			for (int c = 0; c < a[r].length; c++) {

				System.out.print("," + a[r][c]);
			}
			System.out.println();

		}
	}
}
