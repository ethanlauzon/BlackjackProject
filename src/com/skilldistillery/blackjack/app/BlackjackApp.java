package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackjackHand;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp blackjackApp = new BlackjackApp();
		blackjackApp.startScreen();
	}

	public void playBlackjack() {
		
		int total = 0;
		int numCardsDealt = 0;
		String userInput;
		String hit = "hit";
		Deck deck = new Deck();
		Card card = deck.dealCard();
		Scanner sc = new Scanner(System.in);
		
		deck.blackjackDeck();
		deck.mixDeck();
		deck.dealCard();
		total += card.getValue();
		System.out.print("Dealt " + card + " => ");
		System.out.println("your total hand " + total);

		while (total < 21) {
			
			System.out.println("Hit or Stay");
			userInput = sc.nextLine();
			
			while (userInput.equalsIgnoreCase(hit)) {
				deck.dealCard();
				total += card.getValue();
				numCardsDealt++;
				System.out.print("Dealt " + card + " => ");
				System.out.println("your total hand " + total);

				if (total > 21) {
					System.out.println("You Lose");
					break;
				}
			}
		}
		sc.close();
	}

	public void startScreen() {
		String choice = "yes";
		Scanner sc = new Scanner(System.in);
		BlackjackHand blackjackHand = new BlackjackHand();

		System.out.println("Would you like to play blackjack? Please enter yes or no ");
		String userInput = sc.nextLine();

		if (userInput.equalsIgnoreCase(choice)) {
			blackjackHand.isBlackjack();
		} else {
			System.out.println("Goodbye");
		}
		sc.close();
	}
}
