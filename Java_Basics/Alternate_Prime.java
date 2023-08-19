package javahub;

public class Alternate_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		Alter a = new Alter();
		a.calPrime(num);
	}

}
class Alter{
	public void calPrime(int n) {
		int x,count=0,count1=0;
		while(n<=20) {
			count=0;
			for(x=2;x<=n/2;x++) {
				if(n%x==0) {
					count++;
					break;
				}
			}
			if(count==0)
			{
				count1++;
				if(count1%2!=0) 
					System.out.println(n);
			
			}
		n++;
		}
	}
}