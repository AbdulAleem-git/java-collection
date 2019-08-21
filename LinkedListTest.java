package collection;


import java.util.LinkedList;


public class LinkedListTest {
	public static void main (String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("adam");
		ll.add("newton");
		ll.add("Einsteen");
		ll.add("faraday");
		ll.add("madam Query");
		ll.add("Galilio");
		ll.add("New Space");
		
		//System.out.println(ll);
		for(String ele : ll)
		{
			System.out.println(ele);
		}
		/*Iterator<String> itr = ll.iterator();
		while(itr.hasNext())
		{
			String str = itr.next();
			System.out.println(str);
		}*/
		
		
		ll.addFirst("Abdul");
		ll.addLast("aleem");
		for(String ele : ll)
		{
			System.out.println(ele);
		}
		
		
		String str1 = ll.get(8);
		System.out.println(str1);
		System.out.println(ll.indexOf("galilio"));
		
		ll.remove(7);
		ll.remove("adam");
		System.out.println(ll);
	}

}
