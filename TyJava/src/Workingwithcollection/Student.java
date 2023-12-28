package Workingwithcollection;
import java.util.*;
public class Student implements Comparable{
	String sname;
	int rollNo;
	double perc;
	int Class;
	public Student(String sname, int rollNo, double perc, int Class) {
		
		this.sname = sname;
		this.rollNo = rollNo;
		this.perc = perc;
		this.Class = Class;
	}
	public String toString() {
		return "Student name:"+this.sname+" "+"Rollno:"+this.rollNo+" "+"Percentage:"+this.perc+" "+"Class:"+this.Class;
	}
	public int compareTo(Object o) {
		Student s=(Student)o;
		if(this.perc==s.perc) {
			return 0;
		}else if(this.perc>s.perc) {
			return 1;
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		LinkedList<Student> data=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the details");
		System.out.println("Enter the name");
		String sname=sc.nextLine();
		System.out.println("Enter the roll no");
		int rollNo=sc.nextInt();
		System.out.println("Enter the percentage");
		double perc=sc.nextDouble();
		System.out.println("Enter the Class");
		int Class=sc.nextInt();
		
		data.add(new Student(sname, rollNo, perc, Class));
		boolean flag=true;
		do {
			System.out.println("Press Y to enter the details else Press any key to exit");
			char ch=sc.next().charAt(0);
			if(ch=='Y'||ch=='y') {
				System.out.println("Enter the details");
				System.out.println("Enter the name");
				sc.nextLine();
			 sname=sc.nextLine();
				System.out.println("Enter the roll no");
				 rollNo=sc.nextInt();
				System.out.println("Enter the percentage");
			 perc=sc.nextDouble();
				System.out.println("Enter the Class");
			 Class=sc.nextInt();
			 data.add(new Student(sname, rollNo, perc, Class));
			}else {
				flag=false;
			}
		}while(flag);
		System.out.println("before sorting");
		System.out.println(data);     
		System.out.println("After sorting on the basis of percentage");
		Collections.sort(data);
		for(Student details:data ) {
			System.out.println(details);
		}
		
	}

	}


