package com.skilldistillery.blackjack.entities;
import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	
	public List<Card> getCards() {
		return cards;
	}

	@Override
	public String toString() {
		return "Hand cards " + cards + " Hand Value " + getHandValue();
	}

	protected List<Card> cards;
	
	
	public Hand() {
		cards = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void clear() {
		cards.removeAll(cards);
	}
	
	
	
	public abstract int getHandValue();
	
	
}
