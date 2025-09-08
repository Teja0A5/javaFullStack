package basics;

import java.util.Scanner;

public class Swappingof2numbers {
	public static void main(String[] args) {
		int x,y,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value X:");
		x=sc.nextInt();
		
		System.out.println("Enter The Value Y:");
	    y=sc.nextInt();
	    
	System.out.println("Before Swapping The Numbers: "+x+" "+y);
	temp=x;
	x=y;
	y=temp;
	System.out.println("After Swapping The Numbers: "+x+" "+y);
	
	
	}

}
