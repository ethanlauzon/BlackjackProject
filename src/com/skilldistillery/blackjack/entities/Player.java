package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class Player {
	protected BlackjackHand playerHand = new BlackjackHand();

	public void addCard(Card card) {
		playerHand.addCard(card);
	}

	@Override
	public String toString() {
		return "Player Hand = " + playerHand;
	}
//	public void hitStay() {
//		int total = 0;
//		String userInput;
//		Scanner sc = new Scanner(System.in);
//		
//			
//			System.out.print("Dealt " + card + " => ");
//			System.out.println("your total hand " + total);
//			
//
//	}

}
