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
			System.out.println("Hit or Stay");
			userInput = sc.nextLine();
			if (blackjackHand.getHandValue() < 21) {
				
			
				switch (userInput) {
				case "hit":
				case "Hit":
					dealer.dealCard(player);
					System.out.println(player.toString());
					if(blackjackHand.getHandValue() > 21) {
						System.out.println("you lose");
					}
					break;
				case "stay":
				case "Stay":
					System.out.println(player.toString());
					break;
				default:
					System.out.println("invalid entry, enter either hit or stay");
				}

			}
		}
			sc.close();

		}
	}

