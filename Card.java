
public class Card
{
	//Valid card suits
	private Deck[] mySuit;
	//Number of cards
	private int myNumber;
	
	public Card(Deck[] aSuit, int aNumber)
	{
		this.mySuit = aSuit;
		if (aNumber >= 1 && aNumber <= 13)
			{
			this.myNumber = aNumber;
			}
		else 
			{
			System.out.println(aNumber + " is not a valid card number.");
			}
		
	}
	
	//Allow others to use myNumbers
	public int getNumber()
	{
		return myNumber;
	}
	
}
