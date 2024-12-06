
public class Card {

	//What does this need to exist?
	private int value;
	private char suit;
	
	//Default constructor 
	public Card()
	{
		
		//this.value = 0;
		//this.suit = 'n';
		setValue(0);
		setValue('n');
	}
	
	public Card(int value, char suit){
		setValue(value);	
		setSuit(suit);
	}
	
	//getters
	public int getValue(){
		return this.value;
	}
	
	public char getSuit(){
		return this.suit;
	}
	
	//setters
	public void setValue(int value)
	{
		if(value >= 1 && value <= 13)
		{
		this.value = value;
		}
		else
		{
			this.value = 0;
		}
	}
	public void setSuit(char suit)
	{
		this.suit = suit;
	}
	public boolean equals(Card c)
	{
		boolean returnValue = (c.getSuit() == this.getSuit()) && (c.getValue() == this.getValue());
		return returnValue;
	}
	
	public String toString(){ 
		String returnString = getValue() + " " + getSuit();
		return returnString;
	}
}










