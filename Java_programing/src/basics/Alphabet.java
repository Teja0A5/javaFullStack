package basics;

import java.util.Scanner;

public class Alphabet {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Alphabet :");
		char s=sc.next().charAt(0);
if(s =='a'||s=='e'||s== 'i'||s=='o'||s=='u') 
System.out.println("The given Alphabet is vowel ");
else
System.out.println("its is cosonant");
	
	}
}
