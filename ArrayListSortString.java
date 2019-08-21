package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortString {
	
	public static void main(String args[]) {
		
	
	List<String> ar = new ArrayList<String>();
	ar.add("ramcharan");
	ar.add("ramKishan");
	ar.add("ramchauhan");
	ar.add("ramBabu");
	ar.add("ramchand");
	ar.add("ramYellow");
	ar.add("ramPeela");
	ar.add("ramcwhy");

	
	//ar.sort(Comparator.naturalOrder());
	Collections.sort(ar);
	System.out.println(ar);
	
	}
}
