package Collections;

import java.util.ArrayDeque;

public class Queue{

	public static void main(String[] args) {
	ArrayDeque aq =new ArrayDeque();
	aq.offer("A");
	aq.offer("B");
	aq.offer("C");
while(!aq.isEmpty())
	System.out.println("Poll()"+aq.poll());
aq.push(10);
aq.push(30);
aq.push(20);
while(!aq.isEmpty())
	System.out.println("pop()"+aq.pop());
aq.push(10);
aq.push(30);
aq.push(10);
System.out.println("pop()"+aq.pop());
aq.addFirst(5);
aq.addLast(50);
System.out.println(aq);
System.out.println("Remove First "+aq.remove());
System.out.println("Remove Last "+aq.remove());
System.out.println(aq);

	}

}
