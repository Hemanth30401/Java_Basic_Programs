package javahub;

public class Prime_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=3,k=2,count=0;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count=0;
				for(int z=1;z<=k;z++)
				{
					if(k%z==0)
						count++;
				}
				if(count==2)
					System.out.print(k + " ");
				else
					j--;
				k++;
			}
			System.out.println();
		}
	}
}
