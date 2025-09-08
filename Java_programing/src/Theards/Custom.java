package Theards;

public class Custom implements Runnable
{
public void run()
{
for(int i=0;i<6;i++)
{
	System.out.println(i);

	try{
	Thread.sleep(2000);
}
catch(InterruptedException e)
{
	System.out.println("Thread Interrupted");
}}
}
public static void main(String[] args) {
		Custom obj=new Custom();
		Thread t=new Thread(obj);
		t.start();
		// TODO Auto-generated method stub

	}

}
