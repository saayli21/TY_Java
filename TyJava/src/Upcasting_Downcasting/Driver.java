package Upcasting_Downcasting;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Sub s1=new Sub();
   System.out.println(s1.a);
   System.out.println(s1.b);
   System.out.println(s1.ch);
   System.out.println(s1.d);
   Super s2= s1;  //Upcasting
//   System.out.println(s2.ch);
//   System.out.println(s2.d);
   
   Sub s3=(Sub)s2;   //Downcasting
   System.out.println(s3.ch);
   System.out.println(s3.d);
	}

}
