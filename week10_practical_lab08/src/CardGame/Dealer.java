package CardGame;
public class Dealer  {
	
	CardDeck deck;
	
	public Dealer() {
		deck = new CardDeck();
	}
	
	public void dealTo(CardPlayerBehavior p) {
	while(p.wantsACard()) {
		Card card = deck.newCard();
		if(!p.receiveCard(card)) break;
	}



	}
	
	public void dealOneTo(CardPlayerBehavior p) {
	if(p.wantsACard()) {
		Card card = deck.newCard();
		if(!p.receiveCard(card)) { System.out.println("카드 수령 실패!"); }
	}
	}
}
