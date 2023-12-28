package ArrayOfObjects;

public class School {
	String sname; 
	int rollNo; 
	int std;
	    
	    public School(String sname, int rollNo, int std) {
		super();
		this.sname = sname;
		this.rollNo = rollNo;
		this.std = std;
	}
	    public String toString()
	    {
	    	return "Student Name:"+this.sname+ " " +"Roll Number:"+this.rollNo+ " " +"Standard:"+this.std;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School arr[]= {new School("Raj",1,3), new School("Aman",2,4), new School("Raj",4,5)};
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}


	


