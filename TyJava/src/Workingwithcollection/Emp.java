package Workingwithcollection;

import java.util.Collections;
import java.util.LinkedList;

public class Emp implements Comparable{
		String ename;
		int eid;
		double salary;
		public Emp(String ename, int eid, double salary) {
			
			this.ename = ename;
			this.eid = eid;
			this.salary = salary;
		}
		//overrideing toString()
		public String toString() {
			return "Ename:"+this.ename+" "+"Eid:"+this.eid+" "+"Salary:"+this.salary;
		}
		public int compareTo(Object o) {
			Emp e=(Emp)o;
			if(this.salary==e.salary) {
				return 0;
			}else if(this.salary>e.salary) {
				return 1;
			}else {
				return -1;
			}
		}

		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			LinkedList<Emp> data=new LinkedList<>();
			data.add(new Emp("Asit",2,36000));
			data.add(new Emp("Soban",1,35000));
			data.add(new Emp("Aakash",3,37000));
			System.out.println(data);
			Collections.sort(data);
			System.out.println("After sorting on the basis of ascending order of salary");
			for(Emp e:data) {
				System.out.println(e);
			}
			

			
		}
		


}
