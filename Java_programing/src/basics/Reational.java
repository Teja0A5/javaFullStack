package basics;

import java.util.Scanner;

public class Reational {
public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the a");
		int num1=s.nextInt();
		System.out.println("enter the b");
		int num2=s.nextInt();
		 System.out.println("Comparisons between " + num1 + " and " + num2 + ":");
	        System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
	        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
	        System.out.println(num1 + " >  " + num2 + " : " + (num1 > num2));
	        System.out.println(num1 + " <  " + num2 + " : " + (num1 < num2));
	        System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
	        System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
	        
	       // input.close();
	    }
	}
