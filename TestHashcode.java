package collection;

class Person1{
	
	int mob;
	
	String sender;
	String message;
	String subMessage;
	Person1(int m,String s, String message, String sub)
	{
		 this.mob = m;		 
		 this.sender = s;
		 this.message = message;
		 this.subMessage = sub;		 
	}
	public boolean equals(Person1 p) {
		
		if(p.mob == this.mob && p.sender == this.sender && p.message == this.message && p.subMessage == this.subMessage)
			return true;
		else 
			return false;
				
	}
	
	
	public int hashCode(Person1 p){
		if(this.equals(p))
		{
			return this.hashCode();
		}
		else
		{
			return p.hashCode();
		}
		
	}
	
	
}

public class TestHashcode {

	public static void main(String args[]) {
		Person1 p1 = new Person1 (999,"ram","hello","echo");
		Person1 p2 = new Person1 (999,"ram","hello","echo");
		Person1 p3 = new Person1 (999,"ramu","hello","echo");
		/*if(p1.equals(p2))
		{
			System.out.print("yes");
		}
		*/
		int hp2 = p1.hashCode(p2);
		//System.out.print(hp2+"  "+p1.hashCode());
		int hp3 = p1.hashCode(p3);
		
		System.out.print(hp2+"  "+p1.hashCode()+" "+hp3);
		
		//System.out.print(p1.hashCode());
		
		
	}
}
