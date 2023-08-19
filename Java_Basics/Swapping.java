package javahub;

public class Swapping
{
public static void main(String[] args) 
{
 int n = 123456,rem=0,rem1=0,sum1=0,a=1;
		while(n>0) {
		rem=n%10;
		n=n/10;
		rem1=n%10;
		rem1=rem1+rem*10;
		sum1=sum1+rem1*a;
                                                                                                                                                                                                             		n=n/10;
		a*=100;
		}
		System.out.print(sum1);
	}

}
