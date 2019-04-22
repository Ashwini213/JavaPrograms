/**
 * 
 */
package com.bridgelabz.deckofcards.main;


/**
 * @author all
 *
 */
public class DeckOfCardsMain {
	public static void main(String[] args) {

		DeckOfCardsManager cards = new DeckOfCardsImplementation();
		cards.intialize();
		cards.shuffle();
		cards.display();
	}
}