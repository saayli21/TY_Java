package Pattern;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int firstrow= n/2+1;
		for(int row=1; row<=firstrow; row++) {
			for(int space=row; space<=firstrow-1; space++) {
				System.out.print(" ");
			}
			for(int col=1; col<=2*row-1; col++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		int secondrow=n/2;
		for(int row=secondrow; row>=1; row--) {
			for(int space=row; space<=secondrow; space++) {
				System.out.print(" ");
			}
			for(int col=1; col<=2*row-1; col++) {
				System.out.print("*");
			}
			System.out.println( );
		}

	}

}
