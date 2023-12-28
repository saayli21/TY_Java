package Pattern;

public class AtTheRatePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char ch='A';
       int num=1;
       for(int row=1; row<=4; row++) {
    	   for(int col=1; col<=4; col++) {
    		   if(row==col) 
    		   {
    			   System.out.print("@"+ " ");
    		   }
    		   else if(col>row) 
    		   {
    			   System.out.print(ch+ " ");
    			   ch++;
    		   }
    		   else 
    		   {
    			   System.out.print(num+ " ");
    			   num++;
    		   }
    	   }
    	   System.out.println();
       }
	}

}
