package Collections;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
	Stack s=new Stack();
	s.push(10);
	s.push(20);
	s.add(40);
	System.out.println("pop()"+s.pop());
	System.out.println("peek()"+s.peek());
	System.out.println("search()"+s.search(30));
	while(!s.isEmpty())
		System.out.println("Poped:"+s.pop());

	}

}
