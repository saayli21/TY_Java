package ObjectClass;

public class OverridingEqualsMethod {
	String ename;
	int eid;
	double salary;
	OverridingEqualsMethod(String ename, int eid, double salary){
		this.ename=ename;
		this.eid=eid;
		this.salary=salary;
	}
	//OVERRIDE EQUALS METHOD
	public boolean equals(Object o) {
		OverridingEqualsMethod e=(OverridingEqualsMethod)o;  //DOWNCASTING
		if(e.salary==this.salary) {
			return true;
		} else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingEqualsMethod o1=new OverridingEqualsMethod("saloni", 1, 35000);
		OverridingEqualsMethod o2=new OverridingEqualsMethod("tanu", 2, 35000);
		System.out.println(o1.equals(o2));
	}
}
