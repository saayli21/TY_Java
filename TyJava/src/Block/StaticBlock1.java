package Block;

public class StaticBlock1 {
	static {
		System.out.println("Sib-1");
		
	}
	static {
		System.out.println("Sib-2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("Main Method");
		}

	}

}
