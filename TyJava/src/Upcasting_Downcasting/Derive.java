package Upcasting_Downcasting;

public class Derive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println(c1 instanceof Parent);
        System.out.println(c1 instanceof Child);
        
        Parent p1=new Parent();
        System.out.println(p1.a);
		System.out.println(p1.b);
	//	System.out.println(p1.c);
	//	System.out.println(p1.d);
		System.out.println(p1 instanceof Parent);
        System.out.println(p1 instanceof Child);
        
        p1=c1; //Upcasting 
        System.out.println(c1);
        System.out.println(p1);
        System.out.println(p1 instanceof Child);
  //      System.out.println(p1.c);
  //      System.out.println(p1.d);
        
        Child c3=(Child)p1;  //Downcasting
        System.out.println(p1);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c3 instanceof Child);
        System.out.println(c3.c);
        System.out.println(c3.d);
	}

}
