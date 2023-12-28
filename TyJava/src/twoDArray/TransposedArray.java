package twoDArray;
import java.util.*;
public class TransposedArray {
	public static int[][] transpose(int b[][]){
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				if(i>j) {
					int temp=b[i][j];
					b[i][j]=b[j][i];
					b[j][i]=temp;
				}
			}
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the row and column");
 int row=sc.nextInt();
 int column=sc.nextInt();
 int arr[][]=new int[row][column];
 System.out.println("Enter the elements");
 for(int i=0; i<arr.length; i++) {
	 for(int j=0; j<arr[i].length; j++) {
		 arr[i][j]=sc.nextInt();
	 }
 }
     for(int i=0; i<arr.length; i++) {
    	 for(int j=0; j<arr[i].length; j++) {
    		 System.out.print(arr[i][j]+" ");
    	 }
    	 System.out.println();
    }
     
     int result[][]=transpose(arr);
     System.out.println("Transpose of the array");
     for(int i=0; i<result.length; i++) {
    	 for(int j=0; j<result[i].length; j++) {
    		 System.out.print(result[i][j]+ " ");
    	 }
    	 System.out.println();
     }
	}

}
