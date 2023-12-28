package ObjectClass;

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

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp("Shriya",1,30000);
		Emp e2=new Emp("Tanisha",2,35000);
		System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        Emp e3=e2;
        System.out.println(e3.equals(e2));
        System.out.println(e3.hashCode());
        System.out.println(e2.hashCode());
	}

}
