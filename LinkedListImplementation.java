package collection;

public class LinkedListImplementation {
	
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
		
		//Adding a node at the last end
		void addLast(int i) {
			Node tempNode = new Node(i);
			if(head == null)
				head = tempNode;
			else
			{
				Node t = head;
				while(t.next != null)
					t = t.next;
				t.next = tempNode;
			}
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
		
		public void middleElement() {
			Node t1 = head,t2 = head;
			if(head != null)
			{
				while( t2 != null&&t2.next != null )
				{
					t1 = t1.next;
					t2 = t2.next.next;
				
				}
				System.out.println("middle element = "+ t1.info);
			}
			
		}
		
		
		public static void main(String args []) {
			LinkedListImplementation ll = new LinkedListImplementation();
			for(int i = 0 ;  i <= 10 ; i++)
			{
				System.out.println(ll.isEmpty(ll));
				ll.addFirst(i);
				ll.display();
				ll.middleElement();
			}
		}
		
		
}


