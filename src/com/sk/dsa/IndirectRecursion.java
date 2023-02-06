package com.sk.dsa;

public class IndirectRecursion {
	static void fun1(int x) {

		if (x > 0) {// 3 2 1
			System.out.println(x);
			fun2(x - 1);
		}
	}

	static void fun2(int x) {

		if (x > 0) {// 3 2 1
			System.out.println(x);
			fun1(x / 2);
		}
	}

	public static void main(String[] args) {

		int x = 20;
		fun1(x);

	}
}
