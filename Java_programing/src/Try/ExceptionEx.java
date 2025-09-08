package Try;

public class ExceptionEx {
public void display()
{
	try {
		String a=null;
		System.out.println("A value is :"+a.length());
	}
	catch(ArithmeticException obj)
	{
		System.out.println("ArithmeticException ");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array Exception");
		}
	catch(NullPointerException e)
	{
		System.out.println("Null Pointer Exception ");
	}
	catch(Exception e)
	{
		System.out.println("Exception class catch Block");
	}
		}
	public static void main(String[] args) {
		ExceptionEx obj=new ExceptionEx();
		obj.display();
		// TODO Auto-generated method stub

	}

}
