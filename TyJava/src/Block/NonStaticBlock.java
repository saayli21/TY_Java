package Block;

public class NonStaticBlock {
{
	System.out.println("Non-StaticBlock");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Main Method");
    NonStaticBlock n1 =new NonStaticBlock();

	}

}
