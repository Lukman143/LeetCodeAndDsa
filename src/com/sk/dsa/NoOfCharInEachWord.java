package com.sk.dsa;

public class NoOfCharInEachWord {

	public static void main(String[] args) {

		String s = "how are you lukman";

		String[] c = s.split(" ");
		int count=0;

		for (int i = 0; i < c.length; i++) {

			char[] ch = c[i].toCharArray();

			for (int j = 0; j < ch.length; j++) {
				count++;
			}
			System.out.println(c[i] + "-----" + count);
			count = 0;

		}

	}

}
