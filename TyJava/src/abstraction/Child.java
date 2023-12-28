package abstraction;

public class Child extends Parent{
	public void method1()
	{
		System.out.println("Method-2");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		c1.method1();
		Parent p1=c1;
		p1.method1();

	}

}
