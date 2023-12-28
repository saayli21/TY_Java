package methodoverrinding;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Parent p1=new Parent();
    p1.method();
    Child1 c1=new Child1();
    c1.method();
    
//    Child2 c2=new Child2();
//    c2.method();
    
    p1=c1;
    p1.method();
    
    Parent p3=new Child2();
    p3.method();
    		
	}

}
