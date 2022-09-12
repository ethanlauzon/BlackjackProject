package com.skilldistillery.blackjack.entities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {

	private List<Card> deck = new ArrayList<>();

	public int checkDeckSize() {
		return deck.size();
	}

	public void mixDeck() {
		Collections.shuffle(deck);
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

	public void blackjackDeck() {
		if (true) {
			deck = createDeck();
		}
	}

	public Card dealCard() {
		return deck.remove(0);
	}
	
	public void dealCard(Hand hand) {
		hand.addCard(deck.remove(0));
		
	}
}
