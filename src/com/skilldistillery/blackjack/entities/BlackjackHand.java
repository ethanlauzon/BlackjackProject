package com.skilldistillery.blackjack.entities;

import com.skilldistillery.blackjack.app.BlackjackApp;

public class BlackjackHand extends Hand{
	

	public BlackjackHand() {
	}
	
	public boolean isBlackjack() {
		if(getHandValue() == 21) {
			System.out.println("blackjack");
			return true;
		}
		return false;	
	}
	
	public boolean isBust() {
		if(getHandValue() > 21) {
		System.out.println("you bust");	
		return true;
		}
		return false;
	}
	
	@Override
	public int getHandValue() {
		int handValue = 0;
		for (Card card: cards) {
			handValue += card.getValue();
		}
		return handValue;
	}
}
