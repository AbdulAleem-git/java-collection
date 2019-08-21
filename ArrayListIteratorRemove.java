package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIteratorRemove {
	public static void main(String args[]) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(45);
		ar.add(34);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		ar.add(7);
		ar.add(6);
		ar.add(15);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		ar.add(7);
		ar.add(6);
		ar.add(6);
		System.out.println(ar);
		Iterator <Integer> it = ar.iterator();
		while(it.hasNext()) {
			int i = it.next();
			if(i % 5 == 0 ) {
				it.remove();
			}
		}
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		
		
		
		
		
	}
	
}
