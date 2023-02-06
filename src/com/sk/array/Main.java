package com.sk.array;

public class Main {

	public static void main(String[] args) {

		String s = "Geeks";
		String result = reverse(s);
		System.out.println(result);
	}

	private static String reverse(String str) {

		char[] ch = str.toCharArray();

		String result = new String();

		for (int i = ch.length - 1; i >= 0; i--) {

			result += ch[i];

		}
		return result;

	}

}