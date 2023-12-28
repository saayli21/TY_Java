package AccessingMembersOf2Class;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Class1 c1=new Class1();
      System.out.println(c1.a);
      System.out.println(Class1.b);
      c1.b= 40.5;
      System.out.println(c1.b);
	}

}
