package exceptionHandling;

public class TryCatchFinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try 
//		{
//			int arr[]= {1,2,3,4,5};
//			System.out.println(arr[arr.length-1]);
//		}catch(Exception e)
//		{
//			System.out.println("Exception is handled");
//		}
//		finally
//		{
//			System.out.println("This is finally block");
//		}
//	   }
//	}
		
		try  //31 oct 2023
		{
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[arr.length-1]);
		}catch(Exception e)
		{
			System.out.println("Exception is handled");
		}
		finally
		{
			try
			{
				System.out.println(1/0);
			}
			catch(Exception e)
			{
				System.out.println("Exception is handled");
			}
			finally
			{
				System.out.println("this is finally block");
			}
		}
	}
}

 