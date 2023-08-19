package javahub;

public class Valid_number_method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Valid v= new Valid();
		int k=v.n=217;
		int r=v.callValid();
		System.out.println(r);
		if(k%7==0) {
			System.out.println(k + " is a valid number");
		}
		else 
			System.out.println(k + " is not a valid number");
	}

}
class Valid{
	int n;
	public int callValid() {
		int g=0,j=0;
		while(n>0) 
		{
			g=n%10;
			if(g==7) {
				j=g;
			}
			n/=10;
		}
		return j;
	}
}
