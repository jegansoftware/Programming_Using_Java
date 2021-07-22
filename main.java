#include<stdio.h>
int main()
{

	long f=1,f1=1,f3=0;
	long i;
	long n=0;

	
	long cre,pre,diff;
	
	for(i=1;1;i++)
	{
	
		f3=f+f1;
		
		
		if(i>1)
		{
		    cre=f/f1;
		}
		
		if(i>2)
		{
		    diff=cre-pre;
		    diff=diff>0?diff:-diff;
		    
		    if(diff<0.00001)
		    {
		        break;
		    }
		}
	    pre=cre;
		f1=f;	 
		f=f3;
		
	
						
	}
	
	printf("\nNo of terms %ld",i);
	
}

