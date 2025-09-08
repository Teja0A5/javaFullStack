package Nested;

public class Switch {

	public static void main(String[] args) {
		int year=2;
		String dept="Cse";
		switch(year)
		{
		case 1:
			System.out.println("c,phy,eng,math");
			break;
		case 2:
			switch (dept) {
			case "Cse":;
			System.out.println("python,MY SQL");
			break;
			case "Ece":;
			System.out.println("vlsi");
			break;
		
			default:
			System.out.println("enter the correct Dept");
			break;
			}
		
		// TODO Auto-generated method stub

	}
	}
}
