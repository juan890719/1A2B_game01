package com.tom;

public class Poker {

	public static void main(String[] args) {
		int[] cards = new int[52];
		for(int i=0; i<52; i++) {
			cards[i] = i;
		}
		for(int i=0; i<52; i++) {
			if(i%13 == 0 && i != 0) {
				System.out.println();
			}
			System.out.print(cards[i] + " ");
		}
	}

}
