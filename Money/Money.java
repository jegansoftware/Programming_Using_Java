package Jegan;
import java.util.*;
public class Love {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f,n;
		int h50,h20,h10,h5,h2,h1;
		Scanner in=new Scanner(System.in);
		
		
		System.out.printf("\nEnter Amount:");
		f=in.nextInt();
		n=f;
		
		h50=n/50;
		n=n-h50*50;
		
		h20=n/20;
		n=n-h20*20;
		
		h10=n/10;
		n=n-h10*10;
		
		
		h5=n/5;
		n=n-h5*5;
		
		h2=n/2;
		n=n-h2*50;
		
		h1=n;
		
		if(h50>0)
		{
			System.out.printf("\n50 rupees= %d",h50);
		}
		if(h20>0)
		{
			System.out.printf("\n20 rupees= %d",h20);
		}
		
		if(h10>0)
		{
			System.out.printf("\n10 rupees= %d",h10);
		}
		
		if(h5>0)
		{
			System.out.printf("\n5 rupees= %d",h5);
		}
		if(h2>0)
		{
			System.out.printf("\n2 rupees= %d",h2);
		}
		
		if(h1>0)
		{
			System.out.printf("\n1 rupees= %d",h1);
		}
	}
}
