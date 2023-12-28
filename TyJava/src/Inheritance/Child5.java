package Inheritance;

public class Child5 extends Parent5 {
	Child5(int a){
		System.out.println("Constructor-3");
	}
	Child5(){
		this(10);
		System.out.println("Constructor-4");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Child5 c1=new Child5();
         
	}

}
