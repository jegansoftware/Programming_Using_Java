package Jegan;
import java.util.*;
public class sales {

	public static void main(String[] args) {
		int amount;
		double s;
		Scanner in=new Scanner(System.in);
		
		System.out.printf("\nEnter Sales Amount :");
		amount=in.nextInt();
		
		if(amount>=10000)			
		{
			s=amount*10.0/100;
		}
		else
		{
			s=amount*8.5/100;
		}
		
		System.out.printf("\nAmount 	: %d",amount);
		System.out.printf("\nCommission : %.2f",s);
	}

}
