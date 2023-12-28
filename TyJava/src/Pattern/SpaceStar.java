package Pattern;

public class SpaceStar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 for(int row=1; row<5; row++) {
	 for(int col=4; col>0; col--) {
		 if(col==row) 
	 {
	 System.out.print("*");
	 }
	 else 
	 {
		 System.out.print(" ");
	 }
 }
	 System.out.println();
 }
}
}





