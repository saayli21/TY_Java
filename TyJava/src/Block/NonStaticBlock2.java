package Block;

public class NonStaticBlock2 {
	int a=10;
	{
	  a=20;	
	}
	{
	 a=30;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticBlock2 b1=new NonStaticBlock2();
		System.out.println(b1.a);
	}

}
