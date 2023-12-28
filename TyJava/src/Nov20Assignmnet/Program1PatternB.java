package Nov20Assignmnet;

public class Program1PatternB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;   int col=1; int row=5;
		char ch='A'; int space=5;
		
		for(int i=1; i<=row; i++)
		{
			int num1=num;
			char ch1=ch;
			
			for(int k=1; k<=space; k++)
			{
				System.out.print(" ");
			}
			
			   for(int j=1; j<=col; j++)
			   {
				   if(i%2==1)
					   
				   {
					   System.out.print(num1+" ");
					   num1++;
				   }
				   else
				   {
					 System.out.print(ch1+" ");
					 ch1++;
				   }
			   }
			   System.out.println();
			   if(i>1 && i<3)
			   {
				   num++;
			   }
			   else if(i==4)
			   {
				   num+=3;
			   }
			   col++;
			   space--;
			   
		}

	}

}


