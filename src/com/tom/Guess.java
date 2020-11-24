package com.tom;

import java.util.Random;

public class Guess {
	public static void main(String[] args) {
		String s ="0";
		System.out.println((int)s.charAt(0));
		char m = 12;
		System.out.println((int)m);
		Random r = new Random();
		char[] secret = new char[4];
		for (int i=0; i<4; i++) {
			char c = (char)(r.nextInt(10)+48);
			
			boolean duplicated = false;
			for(int j=0; j<i; j++) {
				if(secret[j] == c) {
					duplicated = true;
					break;
				}
			}
			if(duplicated) {
				i--;
			}else {
				System.out.print(c);
				secret[i] = c;
			}
		}
	}

}
