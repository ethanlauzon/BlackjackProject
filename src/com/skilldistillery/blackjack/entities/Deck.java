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
	}

	private List<Card> createDeck() {
		List<Card> deck = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(s, r));
			}
		}
		return deck;
	}

	public Deck() {
		cards = createDeck();
	}

}
