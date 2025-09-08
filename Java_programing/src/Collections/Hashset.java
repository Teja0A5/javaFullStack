package Collections;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(30);
		hs.add(20);
		hs.add(50);
		hs.add(30);
		hs.add(null);
		System.out.println(hs);
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());	
		}
	}	
	}

	

