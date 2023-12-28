package ArrayOfObjects;

import java.util.Scanner;

public class College {
	String sname;
	int regNo;
	String branch;
	

	public College(String sname, int regNo, String branch) {
		super();
		this.sname = sname;
		this.regNo = regNo;
		this.branch = branch;
	}
	public String toString() {
		return "Student Name:"+this.sname+ " " +"Registration Number:"+this.regNo+ " " +"Branch:"+this.branch;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int size=sc.nextInt();
      College arr[]=new College[size];
      System.out.println("Enter the details");
      for(int i=0;i<arr.length;i++)
      {
    	  sc.nextLine();
    	  System.out.println("Enter the name");
    	  String sname=sc.nextLine();
    	  System.out.println("Enter the registration number");
    	  int regNo=sc.nextInt();
    	  System.out.println("Enter the branch");
    	  String branch=sc.nextLine();
    	  arr[i]=new College(sname, regNo, branch);
      }
      
      for(int i=0; i<arr.length; i++)
      {
    	  System.out.println(arr[i]);
      }
      
	}

}





