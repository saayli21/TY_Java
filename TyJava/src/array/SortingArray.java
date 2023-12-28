

package array;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12, 98,45, 23, 74, 56,87}; 
		for(int i=0; i<arr.length; i++)
		{
			for(int k=i+1; k<arr.length; k++)
			{
				 if(arr[i]>arr[k])
				{
					  int temp= arr[i];
					  arr[i]= arr[k];
					  arr[k]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
