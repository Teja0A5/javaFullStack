package sasi;

import java.util.Scanner;

public class Form {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter student name");
        String name=s.nextLine();
        System.out.println("enter age");
        int age=s.nextInt();
        System.out.println("enter marks");
        double marks=s.nextDouble();
        		System.out.println("the student name is " +name);
        		System.out.println("Age is " +age);
        		System.out.println("marks"+marks);
        s.close();
	}

}
