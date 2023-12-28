package Pattern;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int  num=6;
//		for(int row=0; row<num; row++) 
//		{
//			for(int space=num-row; space>1; space--)
//			{
//				System.out.print(" ");
//			}
//			for(int col=0; col<=row; col++)
//			{
//				System.out.print("*");
//			}
//			System.out.println( );
//		}
//		
//    
//	}
//}
		int i, j, row = 6; 
		for (i=0; i<row; i++)   
		{  
			for (j=row-i; j>1; j--)   
			{  
				System.out.print(" ");
			}
			for (j=0; j<=i; j++ )   
			{   
				System.out.print("* ");
			}
			System.out.println();   
		}   
		}   
		}  
		
		
	
	
		
	

