package collection;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMiddleElement {
	public static void main(String args[]) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hello");
		ll.add("hi");
		ll.add("how");
		ll.add("are");
		ll.add("you");
		ll.add("i");
		ll.add("am");
		ll.add("fine");
		ll.add("and you");
		Iterator<String> it = ll.iterator();
		int i = 0 ;
		while(i <  Math.ceil(ll.size()/2))
		{
			it.next();
			i++;
		}
		if(ll.size()%2 == 0)
		{
			System.out.println("middle elements are \'"+ll.get(i-1)+"\' and \'"+ll.get(i)+"\'");
		}
		else
		{
			System.out.print("middle elements is "+ll.get(i));
		}
	}
}
