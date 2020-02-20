package hashCode;

public class Book implements Comparable<Book>{
	private static int counter = 0; 
	public int ID;
	public int point;
	public int getID() {
		return ID;
	}

	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	public Book(int point) {
		super();
		this.ID = counter;
		counter++;
		this.point = point;
	}

	@Override
	public int compareTo(Book o) {
	    if(this.point<o.point)
	          return 1;
	    else if(o.point<this.point)
	          return -1;
	    return 0;
	}

	
	/*public Book(int point) {
		super();
		this.point = point;
		
	}*/
	
	
}
