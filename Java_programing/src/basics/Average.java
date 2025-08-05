package basics;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1=s.nextInt();
		System.out.println("Enter the number 2");
		int num2=s.nextInt();
		System.out.println("Enter the number 3");
		int num3=s.nextInt();
		System.out.println("enterr the number 4");
		int num4=s.nextInt();
		System.out.println("enter the number 5");
		int num5=s.nextInt();
		int d=num1+num2+num3+num4+num5;
		int average=d/5;
		System.out.println("the average is"+average);
				
		// TODO Auto-generated method stub

	}

}
