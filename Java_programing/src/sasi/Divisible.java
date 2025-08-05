package sasi;

import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		// classname obj=new Cont();
		System.out.println("enter a number");
         int a=d.nextInt();
         //int a=20;
		if(a%5==0&&a%11==0) {
		System.out.println("a is divisible");
		}
		else
			System.out.println("its not divisble");
		// TODO Auto-generated method stub

	}

}
