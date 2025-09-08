package Array;

import java.util.Scanner;
public class Arr {
	public static void main(String[] args) {
		int size=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of array size");
		size=sc.nextInt();
		int a[]=new int[size];
		for (int i=0;i<size;i++){
			System.out.println("enter the value for "+"position");
			a[i]=sc.nextInt();
		}		
		for ( int j=0;j<a.length;j++)
		{			
			System.out.println(a[j]+" ");
			System.out.print(a[j]+" ");
			System.out.println(a[j]+" ");
			System.out.print(a[j]+" ");
		}
	}
}