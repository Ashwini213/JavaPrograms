/**
 * 
 */
package com.bridgelabz.deckofcardsusingqueue.main;

import com.bridgelabz.deckofcardsusingqueue.implementation.DeckOfCardsUsingImplementation;
import com.bridgelabz.deckofcardsusingqueue.manager.DeckOfCardsUsingQueueManager;

/**
 * @author all
 *
 */
public class DeckOfCardsUsingQueueMain {
	public static void main(String[] args) {

		DeckOfCardsUsingQueueManager object = new DeckOfCardsUsingImplementation();
		object.initialize();
		object.shuffle();
		object.totalcards();
		object.display();

	}
}