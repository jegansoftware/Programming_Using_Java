package Jegan;
import java.util.*;
public class leaf {
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
		int a;
		int leap=0;
		System.out.printf("\nEnter A Year");
		a=in.nextInt();
		
		
		
		if(a%4==0)
		{
			if(a%100!=0)
			{
				leap=1;
			}
			else if(a%400==0)
			{
				leap=1;
			}
		}
	
		if(leap==1)
		{
			System.out.printf("\nLeap Year");
		}
		else
		{
			System.out.printf("\nNot Leap Year");
		}
		
		
	}

}
