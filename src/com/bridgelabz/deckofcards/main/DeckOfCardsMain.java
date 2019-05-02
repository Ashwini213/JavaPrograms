/**
 * 
 */
package com.bridgelabz.deckofcards.main;

import com.bridgelabz.deckofcards.implementation.DeckOfCardsImplementation;
import com.bridgelabz.deckofcards.manager.DeckOfCardsManager;

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