package ArrayOfObjects;

public class Emp {
	String ename;
    int eid;
    double salary;
    

	public Emp(String ename, int eid, double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}
	public String tostring()
	{
		return  "Student Name:"+this.ename+ " " +"Employee id:"+this.eid+ " " +"Salary:"+this.salary;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp("Saloni",1,80000);
		Emp e2=new Emp("Tanuja",2,70000);
		Emp e3=new Emp("Sayali",3,60000);
		Emp arr[]=new Emp[3];
		arr[0]=e1;
		arr[1]=e2;
		arr[2]=e3;
		
		for(int i=0; i<arr.length; i++) 
		{
		   System.out.println(arr[i]);	
		}
        
        
	}

}
