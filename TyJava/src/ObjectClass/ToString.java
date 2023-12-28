package ObjectClass;

import Inheritance.Emp;

public class ToString {
	String ename;
	int eid;
	double salary;
	ToString(String ename, int eid, double salary){
		this.ename=ename;
		this.eid=eid;
		this.salary=salary;
	}
		public String toString() {
			return "Employee Name:"+ this.ename+" "+ "Eid:" + this.eid+" "  + "Salary:"+ this.salary;
			
		}

   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ToString e1=new ToString("Sayali", 1,2);
	   System.out.println(e1.toString());

	}

}
