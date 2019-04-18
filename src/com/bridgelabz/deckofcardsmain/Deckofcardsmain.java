/**
 * 
 */
package com.bridgelabz.deckofcardsmain;

import com.bridgelabz.deckofcardsimpl.Impldeckofcards;
import com.bridgelabz.deckofcardsinterface.Interfacedeck;

/**
 * @author all
 *
 */
public class Deckofcardsmain {
	public static void main(String[] args) {

		Interfacedeck obj = new Impldeckofcards();
		obj.deckofcards();
		obj.shuffle();
		obj.display();
	}
}