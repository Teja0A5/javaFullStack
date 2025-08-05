package basics;

import java.util.Scanner;

public class Controlstatements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1=s.nextInt();
		System.out.println("Enter Number 2");
		int num2=s.nextInt();
		//System.out.println("Enter Number 3");
		int num3=s.nextInt(); 
		if(num1>num2) {
			System.out.println("Num1 is greater than Num2");
		}
		else if(num1>num3) {
			System.out.println("num1 is greater than num3");
		}
		else if(num2>num1) {
			System.out.println("num2 is greater than num3");
		}
		else if(num2>num3) {
			System.out.println("num2 is greater than num3");
		}
		else if(num3>num1) {
			System.out.println("num3 ");
			
		}
		else
			System.out.println("Num2 is greater than Num1");
			
		// TODO Auto-generated method stub

	}

}
