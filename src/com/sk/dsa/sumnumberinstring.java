package com.sk.dsa;

public class sumnumberinstring {

	public static void main(String[] args) {
		String s = "a2b4e9c4";
		char[] ch = s.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >= 48 && ch[i] <= 57) {
				sum += ch[i] - 48;
			}

		}
		System.out.println(sum);
	}

}
