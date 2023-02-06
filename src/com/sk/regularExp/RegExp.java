package com.sk.regularExp;

public class RegExp {

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static boolean isAllUpper(String s) {
		for (char c : s.toCharArray()) {
			if (Character.isLetter(c) && Character.isLowerCase(c)) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkAlphabet(String name) {
		char[] ch = name.toCharArray();
		for (char c : ch) {
			if (!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String pattern = "@@@-###-***-^^^-ABC???";

		String input = "AcC-1212-P2P-AEC-ACCz156";

		String[] pSentence = pattern.split("-");

		int count = 0;

		String[] sinput = input.split("-");

  		for (int i = 0; i < sinput.length; i++) {
			if ((pSentence[i].contains("@") && checkAlphabet(sinput[i])) && sinput[i].equalsIgnoreCase(sinput[i]))
				count++;

			else if ((pSentence[i].contains("^") && checkAlphabet(sinput[i])) && isAllUpper(sinput[i]))
				count++;

			else if (pSentence[i].contains("#") && isNumeric(sinput[i]))
				count++;

			else if (pSentence[i].contains("*") && sinput[i].equalsIgnoreCase(sinput[i]))
				count++;

			else if (sinput[i].equalsIgnoreCase(sinput[i])) {
				String s2 = sinput[i].substring(0, 3);
				if (s2.equalsIgnoreCase(s2) && checkAlphabet(s2));
				else
					count--;
			}
		}

		if (count == sinput.length - 1) {
			System.out.println("Valid Sentence...!");
		} else
			System.out.println("Invalid Sentence...!");
	}
}