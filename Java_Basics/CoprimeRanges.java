package javahub;

public class CoprimeRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,n,rev=0,i=0,count=0;
		for(x=1;x<=500;x++) {
			rev=0;count=0;
			for(n=x;n>0;n/=10) {
				rev=rev*10+n%10;
			}
			for(i=1;i<=rev;i++) {
				if(x%i==0) {
					count++;
				}
				
			}
			if(count==2&&rev==x) {
				System.out.println(x);
			}
		}
	}

}
