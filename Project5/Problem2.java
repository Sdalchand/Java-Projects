import java.util.Arrays; 
public class Problem2<AnyType>{

	public static <AnyType extends Comparable<AnyType>>  int binarySearch(AnyType[] a, AnyType x){

		//calling the helper method
		
		return binarySearch2(a, x, 0, a.length-1);

		}

//needed to implement so that the begin and end variables could 
//be kept track of as they were being changed 

	private static <AnyType extends Comparable<AnyType>>  int binarySearch2(AnyType[] a, AnyType x, int begin, int end){

		
		int middle = (begin + end)/ 2;

			if(x.compareTo(a[middle]) == 0){
				return middle;
			}
			
			else if (x.compareTo(a[middle]) > 0){
				//new begin will start at midpoint plus 1
				begin = middle + 1; 
				return binarySearch2(a, x, begin, end);
			}
			else if (x.compareTo(a[middle]) < 0){
				//new end would be one less than midpoint
				end = middle - 1; 
				return binarySearch2(a, x, begin, end);
			}

			else{

				return -1;
			}
			
	}

	public static void main(String[] args){
	Rectangle [] myArray = new Rectangle[5];
	Rectangle target = new Rectangle(4,7);
		  myArray[0] = new Rectangle(1,5);
	      myArray[1] = new Rectangle(3,2);
	      myArray[2] = new Rectangle(4,7);
	      myArray[3] = new Rectangle(5,8);
	      myArray[4] = new Rectangle(1,9);
	      Arrays.sort(myArray);
	 	  int index = binarySearch(myArray,target);
	 	  //the program will return the index of the 
	 	  //found rectangle in the now sorted array
		  System.out.println("Found at index" + " " + index + " "
		  	+ "of sorted array");
	}
}
