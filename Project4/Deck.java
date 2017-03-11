import java.util.Collections;

import java.util.Arrays;

public class Deck {

private Card[] theDeck; 
private int top; 
public static final int cardcount = 52;

	public Deck(){

		theDeck = new Card[cardcount];
		int i = 0;
 
    	for (int suit = 1; suit <= 4; suit++){
             for ( int value = 1; value <= 13; value++ ){
                 theDeck[i++] = new Card(suit, value);
                 top = 0;
             }
    	}
	}

	public void shuffle(){
	
	Collections.shuffle(Arrays.asList(theDeck));

	}

	public Card deal(){
	// deal the top card in the deck
			return theDeck[top++];
	} 
}
