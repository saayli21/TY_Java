package Pattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
        for(int row=1; row<=3; row++) 
        {
        	for(int col=1; col<=3; col++) 
        	{
        		if(row==col) 
        		{
        			System.out.print(ch+" ");
        			ch=(char) (ch+3);
        		}
        		else 
        		{
        			System.out.print((row+col)*row+" ");
        		}
        	}
        	System.out.println();
        }
	}

}
	


