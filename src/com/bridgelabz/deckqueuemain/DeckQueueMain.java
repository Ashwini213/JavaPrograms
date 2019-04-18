/**
 * 
 */
package com.bridgelabz.deckqueuemain;

import com.bridgelabz.deckqueueimpl.Deckqueueimpl;
import com.bridgelabz.deckqueueinterface.InterfaceDeckQueue;

/**
 * @author all
 *
 */
public class DeckQueueMain {
	public static void main(String[] args) {

		InterfaceDeckQueue object = new Deckqueueimpl();
		object.deckofcards();
		object.shuffle();
		object.totalcards();
		object.display();

	}
}