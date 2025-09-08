package Arrays;

import java.util.Scanner;

public class Flag {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5,7,9,0};
		int val=0;
		boolean flag=false;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value to find");
				val=sc.nextInt();
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==val)
					{
						flag=true;
						break;
					}
				}
				if(flag)
					System.out.println("Data Found");
	else
		System.out.println("Data Not Found");
	}

	}

