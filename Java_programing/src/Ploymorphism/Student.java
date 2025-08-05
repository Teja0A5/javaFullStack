package Ploymorphism;

public class Student{
	public void Bottle(String name,int RollNo){
System.out.println("Enter The Stundent Name :"+name);
System.out.println("Enter The RollNo: "+RollNo);
	}
	public void Bottle(String name,int RollNo,Double marks) {
		System.out.println("Enter The Stundent Name :"+name);
		System.out.println("Enter The RollNo :"+RollNo);
		System.out.println("Enter The marks :"+marks);
	
	}
	public static void main(String[] args) {
		Student s=new Student();
	 s.Bottle("charan",1001);
	 s.Bottle("Divya", 1002,92.2);
		// TODO Auto-generated method stub

	}

}
