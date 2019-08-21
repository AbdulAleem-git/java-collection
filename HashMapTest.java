package collection;

import java.util.HashMap;
import java.util.Map.Entry;


public class HashMapTest {

	public static void main(String argsp[]) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(100, "hari");
		hm.put(200, "ram");
		hm.put(300, "mohan");
		hm.put(400, "shaan");
		hm.put(500, "ramgopal");
		hm.put(600, "vaani");
		hm.put(700, "rani");
		hm.put(800, "sheela");
		hm.put(900, "meera");
		
		for(Entry<Integer,String> e : hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		System.out.println(hm.containsKey(100));
		
		
	}
}
