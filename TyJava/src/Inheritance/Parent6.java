package Inheritance;

public class Parent6 {
	Parent6(int a){
		this (a,20.5);
		System.out.println("Constructor-1");
	}
	Parent6(int a, double b){
		this();
		System.out.println("Constructor-2");
	}
	Parent6 (){
		System.out.println("Constructor-3");
	}

}
