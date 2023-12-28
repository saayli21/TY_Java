package Workingwithcollection;

import java.util.ArrayList;

public class WorkingWithArrayList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList a1=new ArrayList<>();
          a1.add(10);
          a1.add(20);
          a1.add(true);
          a1.add("Hello");
          a1.add(20);
          System.out.println(a1.size());
          System.out.println(a1);
          System.out.println(a1.get(0));
          System.out.println(a1.get(2));
          
          //ITERATING THE VALUE USING FOR LOOP
          for(int i=0; i<a1.size(); i++)
          {
        	  System.out.println(a1.get(i));
          }
          
	}

}

