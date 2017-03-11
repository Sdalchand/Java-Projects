import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Integer;
import java.util.Arrays;

public class Game {
    
    private Player p;
    private Deck cards;
    private ArrayList<Card> hand;

    // you'll probably need some more here
    
    
    public Game(String[] testHand){
        // This constructor is to help test your code
        // use the contents of testHand to
        // make a hand for the player
        // use the following encoding for cards
        // c = clubs
        // d = diamonds
        // h = hearts
        // s = spades
        // 1-13 correspond to ace - king
        // example: s1 = ace of spades
        // example: testhand = {s1, s13, s12, s11, s10} = royal flush
        p = new Player();
        cards = new Deck();
        cards.shuffle();
        makeHand(testHand);
        // hand takes the value of a copy 
        // of the player's hand
        hand=new ArrayList<Card>(p.getHand());
        System.out.println(checkHand(hand));
    }
        
        
    
    
    public Game(){
        // This constructor is to actually play a normal game
        p = new Player();
        cards = new Deck();
        cards.shuffle();
        // the loop adds 5 dealt cards 
        // to the player's hand
        for(int i=1; i<6; i++){
            p.addCard(cards.deal());
        } 
        // hand takes the value of a copy 
        // of the player's hand
        hand= new ArrayList<Card>(p.getHand());
    }
    


    public void play(){
        // this method should play the game 
        Scanner s= new Scanner(System.in);
        print("Poker Game");
        print("These are the cards dealt:");
        // this loop will print the cards from the hand
        for (Card element: hand){
            print(""+element);  // the card element is casted to a string 
                                // using the toString method in Card
        }
        
        print("How many cards do you want to replace?");
        
        int reject=s.nextInt(); 
        
        if (reject>0){
            for(int i=0; i<reject; i++){
                
                print("What card do you want to replace?" 
                  + " " + "Ex: Enter 1 for the first card.");
                
                int rejcard = s.nextInt();
                // remove the card that the user wants to reject 
                // from the hand in the player class
                p.removeCard(hand.get(rejcard-1));
                // deal a card to that hand
                p.addCard(cards.deal());
            }
        }
        // the variable hand takes the value of a copy
        // of the player's hand
        hand=new ArrayList<Card>(p.getHand());
        // the cards are printed again
        print("This is your new hand:");
        for (Card element: hand){
            print(""+element);
        }
        // The hand is then evaluated
        String result=checkHand(hand);
        print("Your hand has a "+result);    
    }
    
    public String checkHand(ArrayList<Card> hand){
      

        // this method should take an ArrayList of cards
        // as input and then determine what evaluates to and
        // return that as a String
        hand=sortHand(hand);   // the hand is first sorted
        
        // the method evaluates if the hand 
        // has any of the possible hands 
        // strating from the best possible 
        // (royal flush)
        // if the hand is none of the hands it is a no pair
        
        if (royalFlush(hand)){
            return "Royal Flush";
        }
        else if (isStraightFlush(hand)){
            return "Straight flush";
        }
        else if (isFourOfAKind(hand)){
            return "Four of a kind";
        }
        else if(isFullHouse(hand)){
            return "Full House";
        }
        else if (isFlush(hand)){
            return "Flush";
        }
        else if (isStraight(hand)){
            return "Straight";  
        }
        else if (isThreeOfAKind(hand)){
            return "Three of a kind";
        }  
        else if (isTwoPair(hand)){
            return "2 pairs";
        }
        else if (isPair(hand)){
            return "1 pair";
        }
        else{
            return "0 Pairs";
        }
    }
    

   
   public boolean isFlush(ArrayList<Card> hand)

   {

      //check if all the suits are the same:

      if(hand.get(0).getSuit()== hand.get(1).getSuit() && 
         hand.get(0).getSuit()== hand.get(2).getSuit() &&
         hand.get(0).getSuit()== hand.get(3).getSuit() && 
        hand.get(0).getSuit()== hand.get(4).getSuit())
      {
          if(!isStraightFlush(hand))  
          {
            return true;
          }
      } 
      return false;  //otherwise it's not a flush
   }

   

   //Returns true if PokerHand is a straight (and not a straight flush) 

   //returns false otherwise.



   public boolean isStraight(ArrayList<Card> hand)

   {
       int[] cardValues = new int[13];
       for(int i = 0; i < hand.size(); i++){
          cardValues[hand.get(i).getValue() - 1]++;
       }
       int firstValue = -1, inARow = 0, lastValue = -5;
       for(int i = 0; i < cardValues.length; i++){
          if(firstValue == -1 && cardValues[i] != 0){
             firstValue = i;
             lastValue = firstValue;
             inARow++;
          }
          if(cardValues[i] != 0 && (i - 1) == lastValue){
             lastValue = i;
             inARow++;
          }  
       }
       if(inARow == 5)  //if it's a straight, make sure it's not a flush:
       {
         if(!isStraightFlush(hand))
         {
           return true;
         }

       }
       return false;
   }

   

   //Returns true if PokerHand is four of a kind

   //false otherwise.

   public boolean isFourOfAKind(ArrayList<Card> hand){

      int[] cardValues = new int[13];
      for(int i = 0; i < hand.size(); i++){
         cardValues[hand.get(i).getValue() - 1]++;
      }

      for(int i = 0; i < cardValues.length; i++){
         if(cardValues[i] == 4){
            return true;
         }

      }
      return false;

   }

   

   public boolean isThreeOfAKind(ArrayList<Card> hand){

      int[] cardValues = new int[13];
      for(int i = 0; i < hand.size(); i++){
         cardValues[hand.get(i).getValue() - 1]++;
      }

      for(int i = 0; i < cardValues.length; i++){
         if(cardValues[i] == 3){
            if(!isFullHouse(hand))
            {   
               return true;
            }

         }

      }

      return false;
   }

 

   public boolean isPair(ArrayList<Card> hand){

      int[] cardValues = new int[13];
      for(int i = 0; i < hand.size(); i++){
         cardValues[hand.get(i).getValue() - 1]++;
      }

      for(int i = 0; i < cardValues.length; i++){
         if(cardValues[i] == 2){
            if(!isTwoPair(hand) && !isFullHouse(hand))
            {   
               return true;
            }
         }
      }
      return false;
   }


   public boolean isTwoPair(ArrayList<Card> hand){

      int[] cardValues = new int[13];
      int numberOfPairs = 0;
      for(int i = 0; i < hand.size(); i++){
         cardValues[hand.get(i).getValue() - 1]++;
      }
      for(int i = 0; i < cardValues.length; i++){
         if(cardValues[i] == 2){
            numberOfPairs++;
         }
      }

      if(numberOfPairs == 2){
        return true;

      }
      return false;
   }



   public boolean isFullHouse(ArrayList<Card> hand){

      int[] cardValues = new int[13];
      boolean hasThreeOfAKind = false;
      boolean hasAPair = false;
      for(int i = 0; i < hand.size(); i++){
         cardValues[hand.get(i).getValue() - 1]++;
      }
      for(int i = 0; i < cardValues.length; i++){
         if(cardValues[i] == 3){
            hasThreeOfAKind = true;
         }
         if(cardValues[i] == 2){
            hasAPair = true;
         }
      }
      if(hasAPair && hasThreeOfAKind){
         return true;
      }
      return false;
   }
   

   //returns true if PokerHand is a straight flush

   public boolean isStraightFlush(ArrayList<Card> hand){

      if(hand.get(0).getSuit()==hand.get(1).getSuit() &&  //if flush
         hand.get(0).getSuit()==hand.get(2).getSuit() &&
         hand.get(0).getSuit()==hand.get(3).getSuit() && 
         hand.get(0).getSuit()==hand.get(4).getSuit()){  

         //check if it's a straight

         int[] cardValues = new int[13];
         for(int i = 0; i < hand.size(); i++){
           cardValues[hand.get(i).getValue() - 1]++;

         }

         int firstValue = -1, inARow = 0, lastValue = -5;

         for(int i = 0; i < cardValues.length; i++){
            if(firstValue == -1 && cardValues[i] != 0){
               firstValue = i;
               lastValue = firstValue;
               inARow++;
            }

            if(cardValues[i] != 0 && (i - 1) == lastValue){
               lastValue = i;
               inARow++;
            }  
         }

         if(inARow == 5){  //it's a straight and a flush so
            return true; 

        } 

      }
      return false;  //it's not a straight or not a flush
   }
    
    public boolean royalFlush(ArrayList<Card> hand){
        // returns 1 if the hand has a royal flush
    
      if (isFlush(hand)){
       
        sortHand(hand);

        if (hand.get(0).getValue() == 1 && hand.get(1).getValue()== 10 
          && hand.get(2).getValue() == 11 && hand.get(3).getValue() == 12 
          && hand.get(4).getValue() == 13){
      
        return true;
      }
    }
      return false;
    
  }
        
    public void makeHand(String[] testHand){
        // this method makes a hand from a array of strings
        Card card; 
        // in the strings the suit corresponds to the first character
        char suitChar;
        int suit;
        int value=1;
        String valueString;
        for(int i=0; i<5; i++){
            suitChar=testHand[i].charAt(0);
            valueString= testHand[i].substring(1);
            // the value of the integer is the last part of the string 
            // either one or two characters that from an integer form 
            // 1 to 13
            value= Integer.parseInt(valueString);
            if (suitChar=='c'){
                suit=1;
            }
            else if (suitChar=='d'){
                suit=2;
            }
            else if (suitChar=='h'){
                suit=3;
            }
            else{
                suit=4;
            }
            card= new Card(suit, value);
            p.addCard(card);
        }
        
    }
        
    public ArrayList<Card> sortHand(ArrayList<Card> hand){
        // this method returns a sorted hand 
        Collections.sort(hand);
        return hand;
    }
    
    public void print(String s){
        // this method is a shortcut to print a string
        System.out.println(s);
    }
}
