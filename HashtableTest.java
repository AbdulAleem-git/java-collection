package collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableTest {
	public static void main(String args[]) {
		Hashtable<String , Integer> ht = new Hashtable<String , Integer>();
		ht.put("raju", 45);
		ht.put("ram", 46);
		ht.put("rahul", 55);
		ht.put("raj", 45);
		ht.put("shyam", 48);
		ht.put("yash", 49);
		ht.put("yuvi", 40);
		ht.put("sachin", 43);
		ht.put("ravindra", 44);
		ht.put("waseem", 42);
		System.out.println(ht);
		System.out.println(ht.containsKey("shyam"));
		System.out.println(ht.containsValue(87));
		System.out.println(ht.containsKey("shya"));
		System.out.println(ht.containsValue(45));	
		
		//ht.put("raju", ht.get("ram")+1);
		System.out.println(ht.get("raju"));
		
		System.out.println(ht.hashCode());
		
		Enumeration<Integer> e = ht.elements();
		while(e.hasMoreElements()) 
		{
			System.out.println(e.nextElement());
		}
	}
}
