package com.sk.dsa;

public class TailHead {

	static void m1(int x) {

		if (x > 0) {//3 2 1
			System.out.println(x);
			m1(x - 1);
			m1(x - 1);
		}
	}

	public static void main(String[] args) {
		int x = 3;
		m1(x);
	}
}
