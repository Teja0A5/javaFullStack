package sasi;

import java.util.Scanner;

public class Job {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("empname");
		String e_name=s.nextLine();
		System.out.println("Job Role");
        String Job_Role=s.nextLine();
		System.out.println("empid");
		int emp_id=s.nextInt();
        System.out.println("salary");
        double salary=s.nextDouble();
       // s.nextLine();
        
        System.out.println(" The employee name is "+ e_name);
        System.out.println("The employee id is "+emp_id);
        System.out.println("The employee salary "+salary);
        System.out.println("The Job Role "+Job_Role);

		// TODO Auto-generated method stub

	}

}
