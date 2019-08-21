package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	public static void main(String args []) {
			
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);

		ar.add(3);
		ar.add(4);

		ar.add(43);
		ar.add(4);
		ar.add(15);
		ar.add(12);
		ar.add(13);
		ar.add(13);
		ar.add(12);
		System.out.print(ar);
		Collections.sort(ar);
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
		
		
	}
}
