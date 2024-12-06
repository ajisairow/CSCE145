
import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();

//Default
	public Deck() {
		int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
		char[] suits = { 'S', 'C', 'H','D'};

		
		//cards = new Card[values.length * suits.length];

		for (int i = 0; i < suits.length; i++) {
			// System.out.println(suits[i]);
			for (int j = 0; j < values.length; j++) {
				Card c = new Card(values[j], suits[i]);
				//cards[(i * values.length) + j] = c;
				cards.add(c);
			}

		}
	}

	public ArrayList<Card> getDeck(){
		return cards;
	}

	public void shuffle(int swaps) {
		Random r = new Random();

		for(int i = 0; i < swaps; i++) {
		int card1 = r.nextInt(this.cards.size());
		int card2 = r.nextInt(this.cards.size());

		//Switches card1 with card2 and vice versa
		
		Card temp = this.cards.get(card1);
		this.cards.set(card1, this.cards.get(card2));	
		this.cards.set(card2, temp);

	}
}	
	
	public void setDeck(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	public Card deal(){
		Card dealtCard = this.cards.remove(0);
	
		return dealtCard; //returns top card of the deck
	}
	
	public void printDeck() {
		for (int i = 0; i < this.getDeck().size(); i++) {
			System.out.println(this.getDeck().get(i));
		}
	}
}


