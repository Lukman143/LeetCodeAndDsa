package com.sk.dsa;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachOccurences {

	public static void main(String[] args) {

		String s = "Airplaneisnice";
		int count = 1;
		Map<String, Integer> map = new HashMap<>();

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != ' ') {

				for (int j = i + 1; j < ch.length; j++) {

					if (ch[i] == ch[j]) {
						count++;
						ch[j] = ' ';
					}
				}
				System.out.println(ch[i] + "---------" + count);
				String s1 = String.valueOf(ch[i]);
				map.put(s1, count);
				count = 1;
			}
		}
		/*
		 * LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		 * 
		 * map.entrySet().stream().sorted(Map.Entry.comparingByKey()) .forEachOrdered(x
		 * -> sortedMap.put(x.getKey(), x.getValue()));
		 * System.out.println("map after sorting by values: " + sortedMap);
		 */
	}
}
