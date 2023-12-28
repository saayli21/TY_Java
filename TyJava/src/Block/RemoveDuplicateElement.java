package Block;

import java.util.Scanner;

public class RemoveDuplicateElement {
	 public static int [] sortTheArray(int b[]) {
		 for(int i=1; i<b.length; i++) {
			 for(int j= i+1; j<b.length; j++) {
				 if(b[i]>b[j]) {
					 int temp=b[i];
					 b[i]=b[j];
					 b[j]=temp;
				 }
			 }
		 }
		 return b;
	 }
	 
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter the array size");
		   int size=sc.nextInt();
		   int arr[]=new int [size];
		   System.out.println("Enter the elements");
		   for(int i=0; i<arr.length; i++) {
			   arr[i]=sc.nextInt();
		 }
           int result[]=sortTheArray(arr);
           int count=0;
           for(int i=0; i<result.length; i++) {
        	   for(int j=i+1; j<result.length; j++) {
        		   if(result[i]==result[j]) {
        			   count++;
        		   }
        	   }
           }
           int b[]=new int[result.length-count];
           int k=0;
           for(int i=0; i<result.length-1; i++) {
        	   if(result[i]!=result[i+1]) {
        		   b[k]=result[i];
        		   k++;
        	   }
           }
         b[k]= result [result.length-1];
           
           for(int i=0; i<b.length; i++) {
        	   System.out.print(b[i]+ " ");
           }
	}

}
