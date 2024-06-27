package ex276;

import java.util.Iterator;
import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		int number = 8642;
		String s = String.valueOf(number);
		boolean result = true;
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			int n = Integer.parseInt(String.valueOf(c));
			if (n % 2 == 0) {
				result = false;
				break;
			}
		}

		System.out.println(result);
	}

}
