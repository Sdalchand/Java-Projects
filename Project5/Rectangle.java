public class Rectangle implements Comparable <Rectangle>
{	
	private int length;
	private int width;
	private int perimeter;

	public Rectangle(int w, int l){

	//initialize variables for the length and width; call
	//necessary methods

 	length = l;
 	width = w;
 	getWidth();
 	getLength();
 	getPerimeter();

	}
	
		public int getWidth()
		{
		return width;
		}
		public int getLength()
		{
		return length;
		}
		public int getPerimeter()
		{
		perimeter = (2 * width) + (2 * length);
		return perimeter;
		}
	//using the compareTo method to compare two rectangles
    //by perimeter size
		
		public int compareTo(Rectangle rec)
		{
	  		if (perimeter < rec.getPerimeter()) {
				return -1;
	 		}
	  		if (perimeter > rec.getPerimeter()) {
				return 1;
			}
			else {
				return 0;
			}
		}

	}