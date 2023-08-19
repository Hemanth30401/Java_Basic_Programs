package javahub;
import java.util.*;
public class Alien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 23,s=0,t1=n,sum=0,s1=0,t2=n,sum1=0;
//		s=n*n;//144
//		while(t1!=0) {
//			sum=sum*10+t1%10;//21
//			t1/=10;
//		}
//		s1=sum*sum;//441
//		while(s1!=0) {
//			sum1=sum1*10+s1%10;//144
//			s1/=10;
//		}
//		if(s==sum1) 
//			System.out.println(t2 + " is a alien number");
//		else
//			System.out.println(t2 + " is not a alien");
		
//		int n=15,i=1,d=0;
//		while(i<=n/2)
//		{
//			if(n%i==0) {
//				d=i;
//			}
//			i++;
//		}
//		System.out.println(d);
		
//		int r=5,k=1,count=0,a=0,sum=0;
//		for(int i=1;i<=r;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{	
//				count=0;a=0;sum=0;
//				for(int z=k;z>0;z/=10)
//				{
//					a=z%10;
//					int fact=1;
//					for(int d=a;d>0;d--) {
//						fact*=d;
//					}
//					sum=sum+fact;
//				}
//				if(sum==k) {
//					System.out.print(k + " ");
//				}
//				else
//				{
//					j--;
//				}
//				k++;
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
//		int a=0,b=1,c=0,i=1,n=10;
//		System.out.print(a + " ");
//		while(i<=n) {
//			c=a+b;
//			b=a;
//			a=c;
//			System.out.print(c + " ");
//			i++;
//		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. Of Rows");
		int r=sc.nextInt();
		int a=0;
		for(int x=1;x<=r;x++)
		{
			for(int y=1;y<=x;y++) 
			{
				System.out.print(a+2 + " ");
				a+=2;
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
