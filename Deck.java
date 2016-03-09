
public class Deck 
{

	private static int Deck;

	public Deck()
	{
	//What is in the deck of cards
	String [] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
	String [] face = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
	int Suits = suit.length;
	int FaceValues = face.length;
	int n = Suits * FaceValues;
	
	//Assemble the deck
	String[] deck = new String[n];
	
	for (int i = 0; i < FaceValues; i++)
		{
			for (int j = 0; j < Suits; j++)
				{
					deck[Suits*i + j] = face[i] + " of " + suit[j];
				}
		}
	//Shuffle up the deck
	for (int i = 0; i < n; i++)
		{
			int r = i + (int) (Math.random() * (n-i));
			String t = deck[r];
			deck [r] = deck[i];
			deck [i] = t;
		}
	
	//Does the deck have suits and face values assigned, show me
	//for (int i = 0; i < n; i++)
		//{
			//System.out.println(deck[i]);
			
		//}
	
	}
	
	//Deal the cards to the player
	public Deck dealcard()
	{
		int Hand;
		if (Deck < Hand)
		{
			return Hand.length[Deck++];
		}
		else
		{
			return null;
		}
	}
	
	public void Hand(Player)
	{
		for(int c = 0; c < 2; c++)
		{
			this.hand[c] = null;
			
		}
		this.numCards = 0;
	}

	public int getNumber()
	{
		return 0;
	}

}