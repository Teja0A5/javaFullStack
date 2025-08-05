package basics;

import java.util.Scanner;

public class Special {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		char value=s.next().charAt(0);
		if(value>='a'&&value<='z') { 
			System.out.println("lower case");
		}
		 else if (value>='A'&&value<'Z') {
		System.out.println("upper case");
		 }
		else
		System.out.println("not an alphabet");
		
		
		// TODO Auto-generated method stub

		}

}
