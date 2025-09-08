package Operation;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The No1 : ");
		int value1 =s.nextInt();
		System.out.println("Enter The No2 : ");
		int value2 =s.nextInt(); 
		System.out.println("Enter The No3 : ");
		int value3=s.nextInt();
		if((value1<value2&&value1<value3)&&(value2>value1&&value2<value3)&&(value3>value1&&value3>value1)) 
			System.out.println("Given numbers  is in accending order");
			else 
				System.out.println("Decending order");
		}
		// TODO Auto-generated method stub

	}


