package com.skilldistillery.blackjack.entities;
public class Player {
	public Hand playerHand;

	public void addCard(Card card) {
		playerHand.addCard(card);
	}
	public Player() {
		 playerHand = new BlackjackHand();
	}
	public Hand getHand() {
		return playerHand;
	}
	@Override
	public String toString() {
		return "Player Hand = " + playerHand;
	}
}
