package Workingwithcollection;

import java.util.Iterator;
import java.util.TreeSet;



public class WorkingWithTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeSet t=new TreeSet();
         t.add(10);
         t.add(1);
         t.add(2);
         t.add(5);
         t.add(7);
         System.out.println(t);
         System.out.println("Printing the element in ascending order");
         Iterator i=t.iterator();
         while(i.hasNext())
         {
        	 System.out.println(i.hasNext());
         }
         System.out.println(i.next());
	}
}

