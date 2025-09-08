package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.offer(20);
		p.offer(10);
		p.add(40);
		p.offer(50);
		p.offer(30);
		System.out.println("peek():"+p.peek());
		Iterator i=p.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		Iterator i2=p.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println();
		while(!p.isEmpty()) {
			System.out.println("poll():"+p.poll());
		}
	}

}
