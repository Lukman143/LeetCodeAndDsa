package com.sk.dsa;

public class ReversingArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int[] a = new int[arr.length];

		for (int k = 0; k < arr.length/2; k++) {
			int temp = arr[k];
			arr[k] = arr[arr.length -1- k];
			arr[arr.length - k - 1] = temp;
		}
		for(int x:arr) {
			System.out.println(x);
		}
	}
}
