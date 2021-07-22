#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	long n;
	long es;
	long dg;
	long cross;
	long total;
	
	for(n=1;n<=50;n++)
	{
	
	
	es=n;
	
	dg=pow(2,n)-1;
	
	cross=n*(n-1);
	
	total=pow(2,n)+n*n-1;
	
	printf("\n%5ld %9ld  %13ld  %17ld",es,dg,cross,total);
	
	
	}

}

