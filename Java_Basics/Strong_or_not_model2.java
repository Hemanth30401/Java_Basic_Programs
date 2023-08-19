package javahub;

public class Strong_or_not_model2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strong1 s = new Strong1();
		s.n=146;
		int res = s.calStrong();
		System.out.println(s.n);
		if(res==s.n) {
			System.out.println(s.n + " is a strong number");
		}
		else
			System.out.println(s.n + " is not a strong number");
	}

}
class Strong1{
	int n;
	public int calStrong() {
		int y,fact=1,sum=0;
		for(int x=n;x>0;x/=10)
		{
			y=x%10;fact=1;
			for(int i=1;i<=y;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
		}
		return sum;
	}
}
