package com.sk.dsa;

public class NestedRecursion {
	static int fun1(int x) {

		if (x > 100)
			return x - 10;
		else
			return fun1(fun1(x + 11));

	}

	public static void main(String[] args) {

		int x = 95;
		System.out.println(fun1(x));

	}
}
