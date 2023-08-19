package javahub;

public class Legal_number_method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Legal l = new Legal();
		long k=l.n=1259060977L;
		long legal=l.callLegal();
		System.out.println(legal);
		if(legal%11==0)
			System.out.println(k + " is a legal number");
		else
			System.out.println(k + " is not a legal number");
	}

}
class Legal{
	long n;
	public long callLegal() {
		int rem=0,b=10,sum=0,res=0;
		for(int i=1;i<=b;i++){
			sum=0;rem=0;
			while(n>0) {
				rem=(int)(n%10);
				sum=i*rem;
				n/=10;
				break;
			}
			res=res+sum;
		}
		return res;
	}
}
