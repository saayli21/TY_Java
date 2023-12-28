package Inheritance;

public class Derive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Parent p1=new Parent();
    p1.a=10;
    p1.b=50.7;
    p1.c=80;
    System.out.println(p1.a+ " " + p1.b+ " " + p1.c);
	
	
	Child c1=new Child();
	c1.a=20;
	c1.b=20.2;
	c1.c=90;
	System.out.println(c1.a+ " " + c1.b+ " " + c1.c);
}
}