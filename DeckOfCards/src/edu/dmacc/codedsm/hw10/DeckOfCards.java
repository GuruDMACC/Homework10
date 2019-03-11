package edu.dmacc.codedsm.hw10;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DeckOfCards {

	public static void main(String[] args) {

		ArrayList<Integer> rank = new ArrayList<Integer>();

		for (int j = 1; j < 14; j++) {
			rank.add(j);
		}

		Map<String, ArrayList> mapDeck = new HashMap<String, ArrayList>();
		mapDeck.put("Clubs", rank);
		mapDeck.put("Hearts", rank);
		mapDeck.put("Diamonds", rank);
		mapDeck.put("Spades", rank);
	
		printDeck(rank, mapDeck);
 
	}

	/**
	 * @param rank
	 * @param mapDeck
	 */
	public static void printDeck(ArrayList<Integer> rank,
			Map<String, ArrayList> mapDeck) {
		for (String name : mapDeck.keySet()) {
			for (Integer s : rank) {		
				System.out.println("Suit: "+ name + " -  " + "Value: "+ s);
			}
		}
	}

	
}
