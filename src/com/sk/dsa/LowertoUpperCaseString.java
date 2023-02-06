package com.sk.dsa;

public class LowertoUpperCaseString {

	public static void main(String[] args) {
		String s = "abcdef";
		char[] ch = s.toCharArray();
		int u = 0, l = 0;

		for (int i = 0; i < ch.length; i++) {

			if (i%2==1 && ch[i] >= 65 && ch[i] <= 90) {
				ch[i]+=32;

			} else if (i%2==0&&ch[i] >= 97 && ch[i] <= 122) {
				ch[i]-=32;
			}
		}
		System.out.println(ch);

	}
}
