package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSort {
	public static void main(String args[]) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(8);
		ll.add(34);
		ll.add(84);
		ll.add(82);
		ll.add(38);
		ll.add(338);
		ll.add(83);
		ll.add(84);
		ll.add(38);
		ll.add(83);
		ll.add(48);
		ll.add(84);
		ll.add(48);
		ll.add(85);
		ll.add(87);
		ll.add(48);
		ll.add(87);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		
		
		
		
	}
	
}
