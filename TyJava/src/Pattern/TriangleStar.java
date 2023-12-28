package Pattern;
import java.util.*;
public class TriangleStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of triangle");
   int num=sc.nextInt();
   
   for(int row=1; row<num; row++) {
	   for(int space=row; space<=num-1; space++) {
		   System.out.print(" ");
	   }
	   for(int col=1; col<=2*row-1; col++) {
		   System.out.print("*");
	   }
	   System.out.println();
   }
 }
}
