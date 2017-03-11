//*********************************************//
//The name of this program is ChangeMaker.
//This program will compute the totalChange for a 
//customer in dollars, quarters, dimes, nickels,
//and pennies given the amount due and the amount
//given to the cashier.
//*********************************************//

import java.util.Scanner;
public class ChangeMaker{

    public static void main(String[] args){
        
        // Ask for input to the user (ask for an int) because 
        //the program is calculating change for 
        //an amount given in pennies.

    	Scanner input = new Scanner(System.in);
    	System.out.println("What is the amount due (in pennies)?");
    	int amtdue = input.nextInt();
    	System.out.println("What is the amount recieved (in pennies)?");
    	int amtpaid = input.nextInt();
    	int totalChange = amtpaid - amtdue;

    	System.out.println("Your change will be given as:");

        //Initialize and declare variables. Take the difference 
        //(totalChange) of the amount paid minus the amount due 
        //and divide by 100 to get the value in dollars. The 
        //remaining amount would be (totalChange - 
        //(dollar amount * 100). This value would be inputted 
        //as the new totalChange. The quarter amount would be
        //(totalChange/25), the remaining amount would be 
        //(totalChange - (dollar amount * 100)). Do this 
        //continuously for each coin.

    	int doll = totalChange/100;
    	totalChange = (totalChange - (doll * 100));

    	int quart = totalChange/25;
    	totalChange = (totalChange - (quart * 25));

    	int dime = totalChange/10;
    	totalChange = (totalChange - (dime * 10));

    	int nick = totalChange/5;
    	totalChange = (totalChange - (nick * 5));

    	int penn = totalChange/1;
    	totalChange = (totalChange - (penn * 1));

        //Tell the computer to print separate labels 
        //for each variable. The Dollars label will 
        //display the amount in dollars (variable doll)
        //that the customer will recieve after paying. The 
        //Quarters will do the same (for variable quart), 
        //Dimes (for variable dime), Nickels 
        //(for variable nick) and Pennies (for variable penn).

    	System.out.println("Dollars: " + doll);
    	System.out.println("Quarters: " + quart);
    	System.out.println("Dimes:" + dime);
    	System.out.println("Nickels:" + nick);
    	System.out.println("Pennies:" + penn);

} // end of the main method 

} // end of the class

