package com.sk.dsa;

public class FiboRecursion {

	static int[] fib = new int[12];

	public static void main(String[] args) {

		// 0 1 2 3 5 7 12

		int f1 = 0, f2 = 1, f3 = 0;

		fib[0] = f1;
		fib[1] = f2;
		for (int i = 2; i <= 10; i++) {
			f3 = f1 + f2;
			fib[i] = f3;
			f1 = f2;
			f2 = f3;
		}
		for (int k = 0; k < fib.length - 1; k++) {
			System.out.println(fib[k]);
		}
	}
}