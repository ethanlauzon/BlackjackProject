package com.skilldistillery.blackjack.app;

import java.util.Scanner;
import com.skilldistillery.blackjack.entities.BlackjackHand;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Hand;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	Scanner sc = new Scanner(System.in);
	Dealer dealer = new Dealer();
	Player player = new Player();
	Deck deck = new Deck();
	BlackjackHand blackjackHand = new BlackjackHand();
	String yes = "yes";

	public static void main(String[] args) {
		BlackjackApp blackjackApp = new BlackjackApp();
		blackjackApp.startScreen();
	}

	public void playBlackjack() {

	}

	public void startScreen() {
		System.out.println("Would you like to play blackjack? Please enter yes or no ");
		String userInput = sc.nextLine();
		if (userInput.equalsIgnoreCase(yes)) {
			dealer.blackjackDeck();
			dealer.mixDeck();
			dealer.initialCardsDealt(player);
			System.out.println(player.toString());
			int totes = player.playerHand.getHandValue();
			if(totes == 21) {
				System.out.println("BlackJack you win");
			}
			while (totes < 21) {
				System.out.println("Hit or Stay");
				userInput = sc.next();
				switch (userInput) {
				case "hit":
				case "Hit":
					dealer.dealCard(player);
					System.out.println(player.toString());
					break;
				case "stay":
				case "Stay":
					System.out.println(player.toString());
					dealer.revealCards();
					break;
				default:
					System.out.println("invalid entry, enter either hit or stay");
					if(totes > 21) {
						System.out.println("you lose");
						dealer.revealCards();
						if(dealer.playerHand.getHandValue() < 17) {
							dealer.dealCard(dealer);
						}
					}
					if(totes == 21) {
						System.out.println("BlackJack you win");
					}
					if( totes < dealer.playerHand.getHandValue()) {
						System.out.println("you lose");
					}
				}
				
				System.out.println(player.playerHand.getHandValue() + " ");
			} 
		}
		sc.close();

	}
}
