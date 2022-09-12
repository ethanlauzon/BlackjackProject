package com.skilldistillery.blackjack.entities;
public class Dealer extends Player{
	
	public Card hiddenCard;
	public Card dealerCard;
    

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
		dealerCard = dealCard(this);
		System.out.println("dealer was dealt " + card);
		card = dealCard(player);
		System.out.println("player was dealt " + card);
		hiddenCard = dealCard(this);
		System.out.println("dealer was dealt face down card");
	}
	
	public void revealCards() {
		System.out.println("dealer was dealt " + dealerCard);
		System.out.println("dealer was dealt " + hiddenCard);
	
	}
}
