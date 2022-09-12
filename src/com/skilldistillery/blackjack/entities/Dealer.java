package com.skilldistillery.blackjack.entities;

import java.util.Collections;

public class Dealer extends Player{

	private Deck deck = new Deck();

	public Card dealCard(Player player) {
		Card card = deck.dealCard();
		player.addCard(card);
		return card;
	}

	public void mixDeck() {
		deck.mixDeck();
		System.out.println("Shuffled deck");
	}

	public void blackjackDeck() {
			deck.blackjackDeck();
	}
	
//	public int addCard(Card card) {
//		deck.dealCard();
//		return addCard(card);
//	}
	
	public void initialCardsDealt(Player player) {
		Card card = dealCard(player);
		System.out.println("player was dealt " + card);
		card = dealCard(this);
		System.out.println("dealer was dealt " + card);
		card = dealCard(player);
		System.out.println("player was dealt " + card);
		card = dealCard(this);
		System.out.println("dealer was dealt face down card");
	}
}
