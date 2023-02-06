package com.sk.dsa;


public class TailRecursion {

	static void fun(int x) {

		if (x > 0) {
			System.out.println(x);
			fun(x - 1);	
		}
	}

	public static void main(String[] args) {

		fun(5);

	}

}
