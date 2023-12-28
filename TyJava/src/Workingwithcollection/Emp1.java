package Workingwithcollection;

import java.util.Arrays;
import java.util.Scanner;

public class Emp1 implements Comparable{
		String ename;
		int eid;
		double salary;
		public Emp1(String ename, int eid, double salary) {
			super();
			this.ename = ename;
			this.eid = eid;
			this.salary = salary;
		}
		@Override
		public int compareTo(Object o) {
			Emp1 e=(Emp1)o;
			if(this.salary==e.salary)
			return 0;
			else if(this.salary>e.salary)
				return 1;
			else
				return -1;
		}
			public String toString() {
				return "Ename:"+this.ename+" "+"Eid:"+this.eid+" "+"Salary:"+this.salary;
			}
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the size");
				int size=sc.nextInt();
				Emp1 data[]=new Emp1[size];
				System.out.println("Enter the details");
				for(int i=0;i<data.length;i++) {
					sc.nextLine();
					System.out.println("Enter the name");
					String ename=sc.nextLine();
					System.out.println("Enter the eid");
					int eid=sc.nextInt();
					System.out.println("Enter the salary");
					double salary=sc.nextDouble();
					data[i]=new Emp1(ename, eid, salary);
					}
				System.out.println("Before sorting");
			for(Emp1 e:data) {
					System.out.println(e);
			}
			Arrays.sort(data);
			System.out.println("After sorting the element");
			for(Emp1 e:data) {
				System.out.println(e);
			}
		
	}

}

