package javahub;

public class Ranges_Automatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1,s=0,a=0,count=0,p=1,t1=0;
		for(;n<=10000;n++) {
			t1=n;count=0;
			for(;n>0;n/=10  )
			{
				count++;
			}
			n=t1;
			s=n*n;
			p=1;
//			for(;count>0;count--) {
//				p=p*10;
//			}
			p=(int)Math.pow(10, count);
			a=s%p;
			if(a==t1)
				System.out.println("Automatic number:" + t1);
		}
		
	}

}
