package com.sk.dsa;

public class CountCharInString {

	public static void main(String[] args) {
		String s = "abcde";
		char[] ch = s.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122
					|| ch[i] >= 48 && ch[i] <= 57 && ch[i] != 32 && ch[i] != ',' && ch[i] != '.')
				count++;
		}
		System.out.println(count);
	}
}
