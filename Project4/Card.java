
public class Card implements Comparable<Card>{
	
	private int suit; // use integers 1-4 to encode the suit
	private int value; // use integers 1013 to encode the value
	String su = "";
	String val = "";

	public Card(int s, int v){
		//make a card with suit s and value v
		suit = s;
     	value = v;
    }

    public int getSuit(){
    	return suit;
    }

    public int getValue(){
    	return value;
    }

    public String stringSuit(){

       if(suit == 1)
         {
          su = "clubs";
         }
       else if(suit == 2)
        {
         su = "diamond";
        }
       else if(suit == 3)
        {
         su = "hearts";
        }
       else if(suit == 4)
        {
         su = "spades";
        }
		return su;
    }

    public String stringValue(){

        if(value == 1)
        {
          val = "ace";
        }
        else if(value == 2)
        {
           val = "two";
        }
        else if(value == 3)
        {
           val = "three";
        }
        else if(value == 4)
        {
           val = "four";
        }
    	else if(value == 5)
        {
           val = "five";
        }
        else if(value == 6)
        {
           val = "six";
        }
        else if(value == 7)
        {
           val = "seven";
        }
    	else if(value == 8)
        {
           val = "eight";
        }
        else if(value == 9)
        {
           val = "nine";
        }
        else if(value == 10)
        {
           val = "ten";
        }
        else if(value == 11)
        {
         val = "jack";
        }
        else if(value == 12)
        {
         val = "queen";
        }
        else if(value == 13)
        {
         val = "king";
        }

        return val;
    }

	
	public int compareTo(Card c){

		if (this.getSuit() < c.getSuit()){
			return -1;
		}
		else if (this.getSuit() > c.getSuit()){
			return 1;
		}
		else{
			if(this.getValue() < c.getValue()){
				return -1;
			}
			else if(this.getValue() > c.getValue()){
				return 1;
			}
			else{
				return 0;
			}
		}
	}
	
	public String toString()
	{
	stringSuit();
	stringValue();

	return val + " " + "of" + " " + su;
	}
}
