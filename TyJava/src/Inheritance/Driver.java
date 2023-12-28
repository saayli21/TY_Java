package Inheritance;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SubClass s1=new SubClass();
    s1.a=10;
    s1.b=40.7;
    s1.f=37.9f;
    s1.ch='s';
	
    SuperClass s2=new SuperClass();
    s2.a=90;
    s2.b=50.9;
    //s2.f=90.9; //CTE
    //s2.ch='h'; //CTE
    System.out.println(s1.a+ " "+ s1.b+ " "+ s1.f+ " "+s1.ch);
    System.out.println(s1.a+ " "+ s1.b);
	}

}
