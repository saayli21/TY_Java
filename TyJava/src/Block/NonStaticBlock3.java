package Block;

public class NonStaticBlock3 {
	int a=10;
	{
		int a=20;
		a=30;
	}
	{
		System.out.println(this.a);
	}
	{
		a=40;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticBlock3 b1=new NonStaticBlock3();
		System.out.println(b1.a);
	}

}
