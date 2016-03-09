
public class Player
{
	private String name;
	//Cards in Hand
	private Deck[] hand = new Deck[10];
	//
	private int numCards;
	//Start player
	public Player(String aName)
	{
		this.name = aName;
		
		this.emptyHand();
		
	}
	//Start counting cards in hand, not to exceed a set limit of ten cards, would already be busted otherwise.
	public void emptyHand()
	{
		for(int c = 0; c < 10; c++)
		{
			this.hand[c] = null;
			
		}
		this.numCards = 0;
		
	}

	// Check if we are exceeding the hand limit and if over 21 combined score.
	public boolean addCard(Deck Deck)
	{
		//Exceeded card count error
		if (this.numCards == 10)
		{
			System.out.println("Too many cards in hand!");
		}
	// Add a card from the deck if under 21.
	this.hand[this.numCards] = Deck;
	this.numCards++;
	
	return(this.getHandSum() <= 21);
	}
	
	//Get a total of the current cards in hand, add them up, and account for Ace values.
	public int getHandSum()
	{
		int handSum = 0;
		int cardNum;
		int numAces = 0;
		
		//Card Count in hand, Aces are 11 at this point.
		for(int c = 0; c < this.numCards; c++)
		{
			cardNum = this.hand[c].getNumber();
			
			if (cardNum == 1)
				{
					numAces++;
					handSum += 11;
				}
			else if (cardNum > 10)
				{
					handSum += 10;
				}
			else
				{
					handSum += cardNum;
				}
		}
		//Convert Aces in the hand to value of 1
		while (handSum > 21 && numAces > 0)
			{
				handSum -= 10;
				numAces--;
			}
		return handSum;
	}
	

}
