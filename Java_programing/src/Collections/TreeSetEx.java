package Collections;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetEx {

	public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add('c');
	ts.add('a');
	ts.add('e');
	ts.add('b');
	Iterator i=ts.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	}

}



