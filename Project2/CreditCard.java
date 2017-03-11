//********************************************//
//This class simulates built-in 
//"checksums" that companies use and checks the 
//"security measures" that are used when creating 
//the account numbers on credit cards. 
//********************************************//

public class CreditCard {
	
	private String number; // The number is stored as a string
	private boolean valid; // The Boolean IV indicating valid or not
	private int errorCode;
	int first;
	int second;
	int third;
	int fourth;
	int fifth;
	int sixth;
	int seven;
	int eighth;
	int ninth;
	int tenth;
	int eleventh;
	int twelfth;

//This constructor accepts a String as input and
//initializes the instance variables: number and valid


	public CreditCard(String cn){
		number = cn;
		valid = true;
		errorCode = 0;
		first = Integer.parseInt(number.substring(0,1));
		second = Integer.parseInt(number.substring(1,2));
		third = Integer.parseInt(number.substring(2,3));
		fourth = Integer.parseInt(number.substring(3,4));
		fifth = Integer.parseInt(number.substring(4,5));
		sixth = Integer.parseInt(number.substring(5,6));
		seven = Integer.parseInt(number.substring(6,7));
		eighth = Integer.parseInt(number.substring(7,8));
		ninth = Integer.parseInt(number.substring (8,9));
		tenth = Integer.parseInt(number.substring(9,10));
		eleventh = Integer.parseInt(number.substring(10,11));
		twelfth = Integer.parseInt(number.substring(11));
	}

//This method checks to see if the first number is a 4.
	private void check1(){
		if(first != 4){
		valid = false;
		errorCode = 1;
		}
	}

//This method checks to see if the fourth number is greater
//than the fifth digit.
	private void check2(){
		if(fourth<fifth){
		valid = false;
		errorCode = 2;
		}
	}
//This method checks to see if the product of the first, fifth
//and ninth digits is 24
	private void check3(){
		if((first * fifth * ninth) != 24){
		valid = false;
		errorCode = 3;
		}
	}
//This method checks to see if the sum of all digits are 
//evenly divisibly by 4. 
	private void check4(){
		if((first + second + third + fourth + fifth + sixth 
			+ seven + eighth + ninth + tenth + eleventh +
			twelfth) % 4 != 0){
		valid = false;
		errorCode = 4;
		}
	}
//This method checks if the sum of the first four digits are first 
//less than the sum of the last four digits
	private void check5(){
		if((first+second+third+fourth) != (ninth+tenth+eleventh
			+twelfth)-1){
		valid = false;
		errorCode = 5;
		}
	}
//This method checks if the sum of the first two digits as a 
//two-digit number and the seventh and eight digits as a two
// digit number, equals 100.
	private void check6(){
		int n1 = Integer.parseInt(number.substring(0,2));
		int n2 = Integer.parseInt(number.substring(6,8));
		if ((n1+n2) != 100){
		valid = false;
		errorCode = 6;
		}
	}
//this public method calls the 6 support methods to check to see
//if the number is valid.
	public void check(){
		check6();
		check5();
		check4();
		check3();
		check2();
		check1();
	}
//This is an accessor method for the IV valid
	public boolean isValid(){
		return valid;
	}
//This is an accessor method for the IV ErrorCode
	public int getErrorCode(){
		return errorCode;
	}
}//end of main method
