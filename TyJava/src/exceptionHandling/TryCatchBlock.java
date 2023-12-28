package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         System.out.println(1);
//         System.out.println(2);
//         System.out.println(3);
//         try 
//         {
//         System.out.println(2/0);
//         } catch(ArithmeticException e) 
//           {
//        	 System.out.println("Exception is handled");
//           }
//         System.out.println(4);
//         System.out.println(5);
		
		
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(2/0);
		   } catch(Exception e) 
		{
			   e.printStackTrace();
		}
		System.out.println(5);
		System.out.println(6);
		
	}

}
