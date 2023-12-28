package Block;

public class ConstructorAndBlock {
	public ConstructorAndBlock() {
		System.out.println("Constructor");
	}
	{
		System.out.println("Iib-2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorAndBlock c1=new ConstructorAndBlock();
	}

}
