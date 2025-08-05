package Ploymorphism;

public class Calculator {
public void  Multiple(int a,int b){
	int result= a*b;
	System.out.println(result);
}
public void Multiple(int a,int b, int c) {
	int result=a*b*c;
	System.out.println(result);
}
public void Multiple(Double a,int b) {
	Double result=a*b;
	System.out.println(result);
}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.Multiple(2, 3);
		c.Multiple(5,6,7);
		c.Multiple(4.22,6);

		// TODO Auto-generated method stub

	}

}
