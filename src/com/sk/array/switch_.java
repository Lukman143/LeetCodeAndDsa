package com.sk.array;

import java.util.Scanner;

public class switch_ {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a name");
		String s = scn.next();
		
		switch (s) {
		case "sk":
			System.out.println("sk...!");
			break;
		case "pk":
			System.out.println("pk...!");
			break;
		default:
			System.out.println("ck...!");
			break;
		}
		
	}
}
