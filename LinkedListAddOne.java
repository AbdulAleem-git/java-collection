package collection;


public class LinkedListAddOne {
	Node head;
	class Node{
		
		Node next ; 
		int info;
		// Creating a Node
		Node(int i){
			this.info = i;
			next = null;
		}
	}
		//Adding a node at first end
		void addFirst(int i ) {
			Node tempNode = new Node(i);
			tempNode.next = head;
			head = tempNode; 
		}
		
				
		// linked list empty or not
		boolean isEmpty(LinkedListImplementation ll)
		{
			if(ll.head != null)
				return false;
			else
				return true;
		}
		
		//Linked list contents
		void display() {
			Node t = head;
			if(t == null)
			{
				System.out.println("NULL");
			}
			int i= 0 ; 
			while(t!=null)
			{
				if(i==0) {
					System.out.print("[ ");
					i++;
				}
				System.out.print(t.info+" ");
				t = t.next;
			}
			System.out.println("]");
		}
}
