package sasi;

public class Leap {
	static int year=2024;
	public static void main(String[] args) {
		if(( year%4==0&&year%100!=0)||(year%400==0)) {
			System.out.println("yes");
		}
		else

		// TODO Auto-generated method stub
		System.out.println("not " +year);
	}

}
