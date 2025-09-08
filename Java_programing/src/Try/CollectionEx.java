package Try;
import java.util.*;
public class CollectionEx {
	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(20);
    al.add(30);
    al.add(50);
   // al.add(null);
    //al.add(10);
    System.out.println("value:"+al.get(1));
    for(int i=0;i<al.size();i++)
    {
    	System.out.println("value:"+al.get(i));
    }
    for(Object val:al)
    	System.out.println(val);
	}

	
	

}
