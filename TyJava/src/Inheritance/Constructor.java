package Inheritance;

public class Constructor {
	Constructor(){
		this(21);
		System.out.println("Constructor-1");
	}
	Constructor(int a){
		System.out.println("Constructor-2");
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Constructor c1=new Constructor();
	}
}

