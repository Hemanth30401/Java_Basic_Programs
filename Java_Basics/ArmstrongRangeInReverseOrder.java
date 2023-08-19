package javahub;

public class ArmstrongRangeInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1,e=10000,count=0,sum=0,c=0,p=0,rev=0;
		for(int i=e;i>=f;i--)
		{
			count=0;
			for(int j=i;j>0;j/=10)
			{
				count++;
			}
			sum=0;
			for(int k=i;k>0;k/=10)
			{
				c=k%10;
				sum=sum+(int)Math.pow(c, count);
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}

}
