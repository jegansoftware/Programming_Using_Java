package Jegan;
import java.util.*;
public class Commission {

	public static void main(String[] args) {
		int a;
		double com;
		Scanner in=new Scanner(System.in);
		System.out.printf("\nEnter Sales Amount :");
		
		a=in.nextInt();
		
		if(a<=500)
		{	
			com=a*1.0/100;
		}
		else  if(a<=5000)
		{
			com=a*5.0/100;
		}
		else
		{
			com=a*8.0/100;
		}
		System.out.printf("\nSales  Amount : %d",a);
		System.out.printf("\nCommission    : %.2f",com);	
	}
}
