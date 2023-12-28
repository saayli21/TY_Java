package Pattern;

public class StarandNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=0;
//		for(int row=1; row<=4; row++){
//			num=row;
//			for(int col=1; col<4; col++) {
//				if(col==2)
//				System.out.print("*"+" ");
//				else if(num%2==0)
//				{
//					System.out.print(num+" ");
//					num=num+2;
//				}
//				else if(num%2!=0)
//				{
//					System.out.print(num+" ");
//					num=num+2;
//				}
//			}
//			System.out.println();
//		}
//	}
//}
	for(int row=1; row<=4; row++) {
		int k=row;
		for(int col=1; col<=3; col++) {
			if(col==2)
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print(k+" ");
				k=k+2;
			}
		}
		System.out.println();
	}
	}
}
		
		
		
		