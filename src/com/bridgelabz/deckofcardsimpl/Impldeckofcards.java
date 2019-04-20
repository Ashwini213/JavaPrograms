/**
 * 
 */
package com.bridgelabz.deckofcardsimpl;

import com.bridgelabz.deckofcardsinterface.Interfacedeck;

/**
 * @author all
 *
 */
public class Impldeckofcards implements Interfacedeck {
	String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] value = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	int totalcount = Suits.length * value.length;
	String[] deck = new String[totalcount];

	@Override
	public void deckofcards() {
		// TODO Auto-generated method stub

		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < Suits.length; j++) {
				deck[Suits.length * i + j] = value[i] + " " + Suits[j];
				// System.out.println(deck[Suits.length * i + j]);
			}

		}
	}

	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
		for (int i = 0; i < totalcount; i++) {
			int r = i + (int) (Math.random() * (totalcount - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Total numver of deck of cards are " + deck.length);
		for (int i = 0; i < 4; i++) {
			System.out.print("----- Person " + (i + 1) + " -----\t");

		}
		System.out.println();
		int k = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(deck[k] + " (Card " + (k) + ")" + "\t");
				k++;
			}
			System.out.println();
		}
	}
}