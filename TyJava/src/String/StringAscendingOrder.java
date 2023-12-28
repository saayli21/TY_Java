package String;
import java.util.*;
public class StringAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "SADF2N3JHSDFJH34KHGSDHF66V";
		 char arr[] = s.toCharArray();
         String value = "";
         TreeSet t = new TreeSet<>();
         for (int i=0; i<arr.length; i++) 
               {
        	     if (arr[i] >= '0' && arr[i] <= '9')
        	     {
                 value = value + arr[i];
	             }
        	     else 
	             {
                  if (!value.isEmpty()) 
	                {
                	  int num = Integer.parseInt(value);
                	  t.add(num);
	                  value = ""; 
	                }
	             }
               }
	        Iterator i = t.iterator();

	        while (i.hasNext()) 

	        {

	            System.out.println(i.next());

	        }

	    }

	}


