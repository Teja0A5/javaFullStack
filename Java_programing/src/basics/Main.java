package basics;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the 1st number");
	int num1=s.nextInt();
	System.out.println("enter the 2nd number");
	int num2=s.nextInt();
	System.out.println("sum "+(num1+num2));
	System.out.println("multipy "+(num1*num2));
	System.out.println("sub " +(num1-num2));
	double div =num1/num2;
	System.out.println("div "+div);
	
		// TODO Auto-generated method stub

	}

}
