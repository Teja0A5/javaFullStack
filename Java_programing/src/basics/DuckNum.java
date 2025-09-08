package basics;

import java.util.Scanner;

public class DuckNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number:");
		String num=sc.next();
		if(num.charAt(0)=='0')
		
		{
			System.out.println("The Given Number Is "+num+" Not A Duck Number");
		}
			else if(num.contains ("0")) {
				System.out.println("The Given Number Is "+num+" Duck Number");
			}
		else
		{
			System.out.println("The Given Number Is "+num+"Not a Duck Number");
		}
	}
}


	