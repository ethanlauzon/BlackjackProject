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
			boolean run = true;
			if (player.playerHand.getHandValue() == 21 && dealer.playerHand.getHandValue() != 21) {
				run = false;
			}
			while (run) {
				System.out.println("Hit or Stay");
				userInput = sc.next();
				switch (userInput) {
				case "hit":
				case "Hit":
					dealer.dealCard(player);
					System.out.println(player.toString());
					if (player.playerHand.getHandValue() > 21) {
						run = false;
						break;
					}
					break;
				case "stay":
				case "Stay":
					System.out.println(player.toString());
					run = false;
					break;
				default:
					System.out.println("invalid entry, enter either hit or stay");
				}
			}
		}

		dealer.revealCards();
//		dealer.playerHand.toString();
		if (dealer.playerHand.getHandValue() > player.playerHand.getHandValue()) {
			System.out.println("Dealers hand is " + dealer.playerHand.getHandValue());
			System.out.println("Dealer wins");
		}
		// 15 12
		// result false
		// 18 12
		// result false
		// 18 17
		// result true
		else if (player.playerHand.getHandValue() > dealer.playerHand.getHandValue()
				&& dealer.playerHand.getHandValue() >= 17 && player.playerHand.getHandValue() <= 21) {
			System.out.println("Dealer stands");
			System.out.println("Dealers hand is " + dealer.playerHand.getHandValue());
			System.out.println("Players hand is " + player.playerHand.getHandValue());
			System.out.println("player wins");
		}

		else if (dealer.playerHand.getHandValue() == 21 && player.playerHand.getHandValue() == 21) {
			System.out.println("Both player and dealer got 21, it's a draw");
		}
		else if (dealer.playerHand.getHandValue() == player.playerHand.getHandValue()) {
			System.out.println("Both player and dealer got same value, house wins");
		}
		
		else if (player.playerHand.getHandValue() == 21 && dealer.playerHand.getHandValue() != 21) {
			System.out.println("BlackJack you win");
			
		}

		else if (player.playerHand.getHandValue() > 21) {
			System.out.println("you bust");
			System.out.println("you lose, the dealer wins");
		} else if (dealer.playerHand.getHandValue() == 21) {
			System.out.println("Dealer got Blackjack");
			System.out.println("You lose");
		}

		else {
			while (dealer.playerHand.getHandValue() < 17 && player.playerHand.getHandValue() < 21) {
//				dealer.dealCard(dealer);
				System.out.println("dealer hit and got a " + dealer.dealCard(dealer));
				System.out.println("Dealers hand is " + dealer.playerHand.getHandValue());
//				final results
				if (dealer.playerHand.getHandValue() > 21) {
					System.out.println("players hand is " + player.playerHand.getHandValue());
					System.out.println("dealer busts");
					System.out.println("Player wins");
					break;
				}
				//
				if (player.playerHand.getHandValue() > dealer.playerHand.getHandValue()
						&& dealer.playerHand.getHandValue() >= 17) {
//					System.out.println("Dealers hand is " + dealer.playerHand.getHandValue());
					System.out.println("players hand is " + player.playerHand.getHandValue());
					System.out.println("Player Wins");
					break;
				}

				if (dealer.playerHand.getHandValue() > player.playerHand.getHandValue()
						&& dealer.playerHand.getHandValue() >= 17) {
//					System.out.println("Dealers hand is " + dealer.playerHand.getHandValue());
					System.out.println("players hand is " + player.playerHand.getHandValue());
					System.out.println("Dealer Wins");
					break;
				}
			}
		}
		sc.close();
	}
}
