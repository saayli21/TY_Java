package Workingwithcollection;

public class MethodRecurssion {
	
		public static void PrintingTheName(int num)
		{
			if(num==0)
			{
				return;
			}
			System.out.println("RAJ");
			PrintingTheName(num-1);
			return;
		}
			
			public static void main(String[] args) {
				PrintingTheName(5);
			
		}

	}


