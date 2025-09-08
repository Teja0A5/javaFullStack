package Operation;

import java.util.Scanner;

public class Profit {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
   	 System.out.println("Enter The Cost Price (cp): ");
        float cp=s.nextFloat();
        System.out.println("Enter The Selling Price(sp) : ");
        float sp=s.nextFloat();
        if(sp>cp) {
        	float profit=sp-cp;
        	System.out.println("profit is :"+profit);
        }
        	else
        System.out.println("loss");		
        
		// TODO Auto-generated method stub
       }
  }