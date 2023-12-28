package Inheritance;

public class Child7 extends Child6 {
	Child7(char ch){
	System.out.println("Constructor-7");
	}
	Child7(char ch, double a){
		this(ch);
		System.out.println("Constructor-8");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Child7 c1=new Child7('A', 20.5);
	}

}
