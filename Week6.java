import java.util.Scanner;

public class Week6 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Deck Deck = new Deck();
		
		for (int i = 0; i < 2; i++)
			{
				Deck.dealcard();
				System.out.println("Cards dealt: " + Deck.dealcard());
			}
		
		//Create the player
		//Player  = new Player("Player 1");
		
		//Add the first and second card.
		//me.addCard(Deck.Deck());
		//me.addCard(theDeck.dealNextCard());
		
		//Display the hand
		//System.out.println(Deck);
		

	}
	
}