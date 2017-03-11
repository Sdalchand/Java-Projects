//*********************************************//
//The name of this program is EasterSunday.
//This program will compute the exact date of
//Easter in Month and Day format for any given
//year.
//*********************************************//

import java.util.Scanner;

public class EasterSunday{

    public static void main(String[] args){

        // Ask for input to the user (ask for an int) because 
        //the program is calculating change for 
        //an amount given in pennies.

    	Scanner input = new Scanner(System.in);
    	System.out.println("Please input a year!");
    	int y = input.nextInt();

        //Initialize and declare variables. Each computational
        //step represents a step in the algorithm.

    	int a = y % 19;
    	int b = y / 100;
    	int	c = y % 100;
    	int	d = b / 4;
    	int	e = b % 4;
    	int	g = (8 * b + 13) / 25;
    	int h = (19 * a + b - d - g + 15) % 30;
    	int j = c / 4;
    	int k = c % 4;
    	int m = (a + 11 * h) / 319;
    	int r = (2 * e + 2 * j - k - h + m + 32) % 7;
    	int n = (h - m + r + 90) / 25;
    	int p = (h - m + r + n + 19) % 32;

        //Tell the computer to print the string 
        //"Easter fell on:" so that the user knows 
        //what the date outputted represents.

    System.out.println("Easter fell on: ");

        //Establish case basis for the value of n. Set
        //n equal to values 1-12, each number standing
        //for a month. Print out corresponding month for
        //n value along with p, which is the date of 
        //Easter.

    if (n == 1) {
    	System.out.println("January " + p);
    } else if (n == 2) {
    	System.out.println("February " + p);
    } else if (n == 3) {
    	System.out.println("March " + p);
    } else if (n == 4) {
    	System.out.println("April " + p);
    } else if (n == 5) { 
    	System.out.println("May " + p);
    } else if (n == 6) {
    	System.out.println("June " + p);
    } else if (n == 7) {
    	System.out.println("July " + p);
    } else if (n == 8) {
    	System.out.println("August " + p);
    } else if (n == 9) {
    	System.out.println("September " + p);
    } else if (n == 10) {
    	System.out.println("October" + p);
    } else if (n == 11) {
    	System.out.println("November " + p);
    } else if (n == 12) {
   		System.out.println("December " + p);
    }
} // end of the main method

}// end of the class
