package Inheritance;

public class Child6 extends Parent6 {
	Child6(int a){
		this(a,20.5);
		System.out.println("Constructor-4");
	}
	Child6(int a, double b){
		super(a);
		System.out.println("Constructor-5");
	}
	Child6(){
		this(10);
		System.out.println("Constructor-6");
	}

}
