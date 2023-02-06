package com.sk.dsa;

public class StringPalindrom {
	public static void main(String[] args) {

		String s = "lol";

		String k = "";
		char[] ch = s.toCharArray();

		
		for (int i = 0; i < ch.length / 2; i++) {

			char temp = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = temp;
		}
		k=new String(ch);

		if (s.equals(k)) {
			System.out.println("its palindrom string");
		}

		for (int j = 0; j < ch.length; j++) {
			System.out.println(ch[j]);
		}
	}

}
