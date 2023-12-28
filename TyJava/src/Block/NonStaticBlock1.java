package Block;

public class NonStaticBlock1 {
	{
		System.out.println("Sib-1");
	}
	
	{
		System.out.println("Sib-2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NonStaticBlock1 b1=new NonStaticBlock1();
     System.out.println("Main Method");
     NonStaticBlock1 b2=new NonStaticBlock1();
	}

}
