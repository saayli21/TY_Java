package Workingwithcollection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class WorkingWithPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PriorityQueue p=new PriorityQueue<>();
        p.add(10);
        p.offer(20);
        p.add(2);
        p.offer(10);
        p.add(4);
        p.add(49);
        System.out.println(p);
        
        Iterator i=p.iterator();
        
	}

}
