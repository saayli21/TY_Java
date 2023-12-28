package Inheritance;

public class TestEngineer extends Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEngineer t1=new TestEngineer();
		System.out.println(t1.ename);
		System.out.println(t1.eid);
		System.out.println(t1.salary);
		System.out.println(t1.blood_group);
		System.out.println(t1.date_of_birth);
		System.out.println(t1.phone_number);
		System.out.println(t1.date_of_joining);
		System.out.println(t1.designation);
		t1.eid=1;
		t1.ename="Sayali";
		System.out.println(t1.eid);
		System.out.println(t1.ename);
		t1.salary=150000.00;
		System.out.println(t1.salary);
	}

}
