package Interface;

public class Child implements Parent1, Parent2 {
	public void m1() 
	{
		System.out.println("Method-1");
	}
	public void m2() 
	{
	   System.out.println("Method-2");	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p1=new Child();  //UPCASTING
		p1.m1();
	//	p1.m2();     //CTE as there is no IS A RELATIONSHIP between PARENT1 and PARENT2 interface
		
		Parent2 p2=new Child();
		p2.m2();
	//	p2.m1();     //CTE as there is no IS A RELATIONSHIP between PARENT1 and PARENT2 interface
		
		

	}

}
