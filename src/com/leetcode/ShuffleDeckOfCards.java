package com.leetcode;

import java.util.Random;

public class ShuffleDeckOfCards {

	public static void main(String[] args) {
		int[] cards = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
				51 };
		shuffle(cards);
		for (int i = 0; i < 52; i++) {
			System.out.print(cards[i] + "  ");
		}
		
		
		for (int i = 0; i < cards.length; i++) {
			int k = i+(new Random()).nextInt(cards.length - i);
			System.out.println(k);
		}
	}

	private static void shuffle(int[] cards) {
		int temp;
		for (int i = 0; i < cards.length; i++) {
			int k = i + (new Random()).nextInt(cards.length - i);
			temp = cards[i];
			cards[i] = cards[k];
			cards[k] = temp;
		}
	}
}
