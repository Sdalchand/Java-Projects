public class Problem1<AnyType>{

	public static <AnyType extends Comparable<AnyType>> AnyType findMax(AnyType[] arr) {
	  int maxIndex = 0;
	  for (int i = 1; i < arr.length; i++)
	    if (arr[i].compareTo(arr[maxIndex]) > 0 )
	       maxIndex = i;
	       return arr[maxIndex];
	}

	public static void main(String[] args){ 

		Rectangle[] shapeArray = new Rectangle[4];
 
		shapeArray[0] = new Rectangle(3,5);
		shapeArray[1] = new Rectangle(2,6);
		shapeArray[2] = new Rectangle(6,1);
		shapeArray[3] = new Rectangle(1,9);

		//calling methods from Rectangle class

		int perim = findMax(shapeArray).getPerimeter();
		int len = findMax(shapeArray).getLength();
		int wid = findMax(shapeArray).getWidth();

		//printing the largest rectangle based on perimeter. Also
		//printing length and width of said rectangle

		System.out.println( "The largest rectangle" + " " +
			"has a perimeter of" + " " + perim);
		System.out.println( "It has a length of" + " " +
		 len + " " + "and a width of" + " " + wid);
	}
}
