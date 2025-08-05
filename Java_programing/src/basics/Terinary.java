package basics;

import java.util.Scanner;

public class Terinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Marks:");
		int marks=s.nextInt();
		String result=(marks<100&&marks>85)?"Distantion":(marks<=85&&marks>75)?"FirstClass":(marks<=75&&marks>65)?"SecondClass":(marks<=65&&marks>45)?"ThridClass":(marks<=45)?"Fail":"EnterValidResult";
		System.out.println("Your Grade is : "+result);
		
		
		// TODO Auto-generated method stub

	}

}
