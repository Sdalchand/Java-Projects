import java.util.ArrayList;

public class Player {
private ArrayList<Card> hand; 
private Deck playersDeck;

	public Player(){

	hand = new ArrayList<Card>();

// create a player here
	} 

	public void addCard(Card c){

		hand.add(c);

// add the card c to the player's hand
	} 
	public void removeCard(Card c){

		hand.remove(c);
// remove the card c from the player's hand
	} 
	public ArrayList<Card> getHand(){
		return hand;
	}
	// you will likely need more methods here
}



