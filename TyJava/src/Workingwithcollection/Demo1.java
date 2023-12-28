package Workingwithcollection;

import java.util.Collections;
import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<Integer>l1=new LinkedList();
        l1.add(10);
        l1.add(20);
        l1.add(35);
        l1.add(3);
        l1.add(1);
        Collections.sort(l1);
        System.out.println(l1);
	}

}
