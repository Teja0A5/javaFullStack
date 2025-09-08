package Try;
import java.util.*;

public class AddRemove {


	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		al.add("Dragon Fruit");
		al.add("Guava");
		ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			String s=(String) li.next();
			if(s.equals("Grapes"))
			{
			 li.add("Dragon");
			}
			if(s.equals("Guava"))
				li.remove();
		} 
			
		System.out.println(al);
			
System.out.println("After Modification:");
System.out.println(al);
}
}
