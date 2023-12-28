package array;

public class MinimumConsecutiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {1,1,1,0,0,0,0,1,1,0,0,0,1,1,1,1,1,0,0};
		  int lowest = 20; // Initial value for lowest
          int count = 0;
          for (int i = 0; i < arr.length; i++) 
          {
        	  if (arr[i] == 1)     
        	  {
                  count++;
        	  }
        	  else
	          {
        		  if (count > 0 && count < lowest)
        		  {
        			  lowest = count;
        		  }
        		  count = 0; // Reset count for the next sequence of ones

	            }
          }
       // Check after the loop in case the consecutive ones are at the end

          if (count > 0 && count < lowest) 
          {
        	  lowest = count;
          }
        
      // If there are no consecutive ones, set lowest to 0

          if (lowest == 20) 
          {
        	  lowest = 0;
          }
          System.out.println("The minimum consecutive ones is: " + lowest);
	}
}




