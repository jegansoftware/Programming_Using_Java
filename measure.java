package Jegan;
import java.util.*;
public class measure {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double fa;
		double inch;
		double miles;
		double ta;
		double pounds;
		
		System.out.printf("\nEnter Fahreheit :");
		fa=in.nextDouble();
		
		System.out.printf("\nEnter Inches    :");
		inch=in.nextDouble();
		
		System.out.printf("\nEnter Miles     :");
		miles=in.nextDouble();
		
		System.out.printf("\nEnter Pounds    :");
		pounds=in.nextDouble();
		ta=pounds/2;
		
		System.out.printf("\nCentigrade   :  %.2f",(fa/2)-15);
		System.out.printf("\nCentimeter   :  %.2f",inch*2+inch/2);
		System.out.printf("\nKilometer    :  %.2f",miles+miles*60/100);
		System.out.printf("\nKilogram	  :  %.2f",ta-ta*10/100);

	}

}
