package Inheritance;

public class Child2 extends Parent2{
	Child2(){
		System.out.println("Constructor-3");
	}
	Child2(int a){
		System.out.println("Constructor-4");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child2 c1= new Child2();
    Child2 c2=new Child2(16);
	}

}
