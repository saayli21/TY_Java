package Interface;

public class ChildOfI implements I {
	public void m1() {
		System.out.println("Method-1");
	}
	public void m2() {
		System.out.println("Method-2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     I i1=new ChildOfI();    //UPCASTING
     i1.m1();
     i1.m2();
     
     
	}

}
