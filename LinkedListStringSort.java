package collection;

import java.util.Collections;
import java.util.LinkedList;


public class LinkedListStringSort {
	public static void main(String args[]) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("forth");
		ll.add("fifth");
		ll.add("sixth");
		ll.add("seventh");
		ll.add("eitth");
		ll.add("nineth");
		ll.add("tenth");
		ll.add("eleventh");
		
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
	}
	
}
