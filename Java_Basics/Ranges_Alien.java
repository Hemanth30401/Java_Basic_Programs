package javahub;

public class Ranges_Alien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,s=0,x=0,y=0,rev=0,z=0,q=0,sum=0;
		for(;n<=100;n++)
		{
			s=n*n;//400
			rev=0;sum=0;
			for(x=n;x>0;x/=10) 
			{
				y=x%10;
				rev=rev*10+y;
			}
			z=rev*rev;//4
			for(;s>0;s/=10) {
				q=s%10;
				sum=sum*10+q;
			}
			
			if(sum==z) {
				System.out.println(n);
			}
		}
	}

}
