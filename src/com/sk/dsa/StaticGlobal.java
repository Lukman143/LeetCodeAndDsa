package com.sk.dsa;

public class StaticGlobal {
	int k = 0;

	static int fun(int x) {
		int k = 0;
		if (x > 0) {

			k++;

			return fun(x - 1) + k;
		}

		return 0;
	}

	public static void main(String[] args) {
		int r;
		r = fun(5);
		System.out.println(r);
		r = fun(5);
		System.out.println(r);
	}
}
