package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards;

	public int checkDeckSize() {
		return cards.size();
	}

	public Card dealCard() {
		return cards.remove(0);
	}

	public void mixDeck() {
		Collections.shuffle(cards);
		System.out.println("Shuffled deck");
	}

	private List<Card> createDeck(int size) {
		List<Card> deck = new ArrayList<>(size);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(s, r));
			}
		}
		return deck;
	}

	public void blackjackDeck() {
		BlackjackHand blackjackHand = new BlackjackHand();
		if (blackjackHand.isBlackjack()) {
			int size = 52;
			cards = createDeck(size);
			System.out.println("Adding 52 cards to deck");
		}

	}

}
