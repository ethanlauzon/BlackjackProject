package com.skilldistillery.blackjack.entities;

import com.skilldistillery.blackjack.app.BlackjackApp;

public class BlackjackHand {

	public BlackjackHand() {
	}
	
	public boolean isBlackjack() {
		BlackjackApp blackjackApp = new BlackjackApp();
		blackjackApp.playBlackjack();
		return true;
	}

}
