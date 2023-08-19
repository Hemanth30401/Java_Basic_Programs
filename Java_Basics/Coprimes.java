package javahub;

public class Coprimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,b=8;
		checkCoprime(a,b);
	}
	static void checkCoprime(int a,int b) 
	{
		if(commonDiv(a,b)==1)
			System.out.println(a + " is coprime of " + b);
		else
			System.out.println(a + " is not coprime of " + b);
	}
	static int commonDiv(int a,int b) 
	{
		if(a==0 || b==0)
			return 0;
		if(a==b)
			return a;
		if(a>b)
			return commonDiv(a-b,a);
		return commonDiv(a,b-a);
		
	}
}
