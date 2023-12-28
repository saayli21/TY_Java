package ObjectClass;

public class School {
	String sname;
	double perc;
	int rollNo;
	int std;
	
	public School(String sname, double perc, int rollNo, int std) {
		
		this.sname = sname;
		this.perc = perc;
		this.rollNo = rollNo;
		this.std = std;
	}
		//OVERRIDE TOSTRING METHOD
		public String toString() {
			return "Student Name:"+ this.sname+ " " +"Percentage:"+ this.perc+ " "+ "Roll Number:"+ this.rollNo+ " "+ "Class:"+ this.std;
		}
		
		//OVERRIDE EQUALS METHOD
		public boolean equals(Object o) {
			School s=(School)o;
			if(s.perc==this.perc && s.sname.equals(this.sname)) 
			{
			return true;
		    }else {
			return false;
		    }
}
        public static void main(String[] args) {
		// TODO Auto-generated method stub
        	School s1=new School("ram",91.8,1,31);
        	School s2=new School("ram",91.8,2,21);
        	System.out.println(s1);
        	System.out.println(s2);
        	System.out.println(s1.equals(s2));
        	School s3=new School("siya",91.8,3,7);
        	System.out.println(s3);
        	System.out.println(s2.equals(s3));

	}

}
