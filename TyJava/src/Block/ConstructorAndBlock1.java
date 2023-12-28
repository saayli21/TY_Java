package Block;

public class ConstructorAndBlock1 {
	static{
		System.out.println("SIB-1");
	}
	static{
		System.out.println("SIB-2");
	}
	public ConstructorAndBlock1() {
		System.out.println("Constructor-1");
	}
	static{
		System.out.println("IIB-1");
	}
	static{
		System.out.println("IIB-2");
	}
	public ConstructorAndBlock1(int a) {
		System.out.println("Constructor-2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorAndBlock1 c1=new ConstructorAndBlock1();
		System.out.println("Main Method");
		ConstructorAndBlock1 c2=new ConstructorAndBlock1(10);
	}

}
