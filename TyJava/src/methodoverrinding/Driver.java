package methodoverrinding;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Father f1=new Father();
      f1.Light();
      Daughter d1=new Daughter();
      d1.Light();
      
      f1=d1;  //UPCASTING
      f1.Light();
	}

}
