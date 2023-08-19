package javahub;

public class Ranges_evil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,s=0,x,y,sum=0,t1;
		for(;n<=100;n++) 
		{	
			s=0;
			s=n*n;
			sum=0;
			for(x=s;x>0;x/=10)
			{
				y=x%10;
				sum=sum+y;
			}
			
			if(sum==n)
				System.out.println("Evil numbers : " + n);
			
		}
		
	}

}
