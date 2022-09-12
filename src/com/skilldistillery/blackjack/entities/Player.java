package com.skilldistillery.blackjack.entities;
public class Player {
	public BlackjackHand playerHand = new BlackjackHand();

	public void addCard(Card card) {
		playerHand.addCard(card);
	}

	@Override
	public String toString() {
		return "Player Hand = " + playerHand;
	}
}
