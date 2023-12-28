package Inheritance;

public class Child4 extends Parent4 {
	Child4(){
		super(10);
		System.out.println("Constructor-4");
	}
	Child4(int a){
		super(a,20.5);
		System.out.println("Constructor-5");
	}
	Child4(int a, double b){
		System.out.println("Constructor-6");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child4 c1=new Child4();
    Child4 c2=new Child4(10);	
    Child4 c3=new Child4(10, 20.5);
	}

}
