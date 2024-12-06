//Blackjack game

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void p(String s) 
	{
		System.out.println(s);
	}
	
	public static void printHand(ArrayList<Card> hand)
	{
		for(int i=0; i<hand.size(); i++)
		{
			p(hand.get(i).toString());
		}
	}	
		public static int computeHandValue(ArrayList<Card> hand) 
		{
			int handValue = 0;
			boolean hasAce = false;
			for(int i = 0; i< hand.size(); i++)
			{
				handValue += hand.get(i).getValue();
				//sum = sum +?
				if (hand.get(i).getValue() == 1)
				{
					hasAce = true;
				}
			
			}
			if(hasAce && handValue <= 11)
			{
				handValue += 10;
			}
			
			return handValue;
		}
		
		public static boolean isOver(ArrayList<Card> hand)
		{
			int handValue = 0;
			boolean hasAce = false;
			for(int i = 0; i< hand.size(); i++)
			{
				handValue += hand.get(i).getValue();
				//sum = sum + ?
				if(hand.get(i).getValue() == 1)
				{
					hasAce = true;
				}	
			}
			if(hasAce && handValue <= 11)
			{
			handValue += 10;		
			}
			return handValue > 21;			
		}
		
		public static void main(String[] args) {
		Deck deck = new Deck();
		Scanner k = new Scanner(System.in);
	
		deck.shuffle(10000);
		
		//Blackjack
		//Dealer wins ties
		//Dealer hits until 17 or above
		
		ArrayList<Card> playerHand = new ArrayList<Card>();
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		
		playerHand.add(deck.deal());
		dealerHand.add(deck.deal());
		playerHand.add(deck.deal());
		dealerHand.add(deck.deal());
		
		
		
		p("Dealer Hand: ");
		printHand(dealerHand);
		
		
		boolean isPlaying = true;
		boolean playerLost = false;
		while(isPlaying)
		{
		
		//Every loop looks at player's hand
			p("Player Hand: ");
			printHand(playerHand);
			
			if(isOver(playerHand))
			{
				playerLost = true;
				break;
			}
		
			
			//Break; exits out of the current loop
			//Continue; ignore the rest of the code and keeps going
			
			//User input
			p("(H)it or (S)tay?");
			String answer = k.nextLine();
			
			//Stops loop if player stays (or any answer than H)
			if(answer.equals("H")) 
			{
				playerHand.add(deck.deal());
			}
			else
			{
				isPlaying = false;
			}
		}
		if (!playerLost)
		{
			while(computeHandValue(dealerHand)<17)
			{
				dealerHand.add(deck.deal());
				p("Dealer's Hand: ");
				printHand(dealerHand);
			}
			
			if(computeHandValue(dealerHand) > 21)
			{
				p("Player wins!");
			}
			else if(computeHandValue(dealerHand) >= computeHandValue(playerHand))
			{
			 p("Dealer wins!");
			}
			else
			{
				p("Player wins!");
			}
			
		}
		else
		{
			p("Player lost");
		}
			k.close();
		
	}
}
			
			
			
			
			
			
			
			
			
			

