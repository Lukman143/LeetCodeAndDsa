package com.sk.dsa;

public class FactoriealRecursion {
	static int fact(int x) {

		if (x == 0) {
			return 1;
		}
		else 
		return fact(x-1)*x;  
	}

	public static void main(String[] args) {

		int x = 5;
		
		System.out.println(fact(x));

	}
}
