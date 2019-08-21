package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String args[]) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("7");
		ar1.add("9");
		ar1.add("rat");
		ar1.add("r");
		ar1.add("hello");
		ar1.add("344.4");
		
		for ( int i = 0 ; i<ar1.size(); i++)
		{
			System.out.println(ar1.get(i));
		}
		for( String str : ar1)
			System.out.println(str);
		String str = ar1.get(1);
		System.out.println(str);
		ar1.set(4, "pi");
		System.out.println(ar1);
		
		
		List<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(1);
		int i = ar2.get(0);
		System.out.print(i);
		
	}

}
