package Array_Chapter1;

public class Adding_pre_and_next_in_other_array {
	public static void main(String[] args) {
//		Add a = new Add();
//		a.calOther();
		
//		Palin1 p = new Palin1();
//		p.n=145;
//		int r=p.calPal();
//		if(p.n==r)
//			System.out.println("A");
//		else
//			System.out.println("N");
		
		
		Strong1 s = new Strong1();
		int r=s.calStrong(145,0);
		s.isStrong(r,145);
			
			
	}
}
//class Add{
//	public void calOther() {
//		int[] a = new int[] {1,2,3,4,5};
//		int[] b = new int[a.length];
//		int x=0;
//		b[x]=a[x]+a[x+1];//b[0]=1+2=3
//		b[a.length-1]=a[a.length-2]+a[a.length-1];//b[4]=4+5=9
//		for(x=1;x<a.length-1;x++) {
//			b[x]=a[x-1]+a[x+1];//a[0]+a[2]
//		}
//		for(int s=0;s<b.length;s++) {
//			System.out.print(b[s] + " ");
//		}
//	}
//}

//class Palin1{
//		int n,rev=0;
//	
//	public int calPal() {
//		
//		for(int i=n;i>0;i/=10) {
//			rev=rev*10+i%10;
//		}
//		return rev;
//	}
//}

class Strong1{
	
	public int calStrong(int n,int sum) {
		for(int i=n;i>0;i/=10) 
		{
			int y=i%10;
			int fact=1;
			for(int j=y;j>0;j--) {
				fact*=j;
			}
			sum+=fact;
		}
		return sum;
	}
	public void isStrong(int sum,int n) {
		if(sum==n) {
			System.out.println("S");
			
		}
		else
			System.out.println("N");
	}
}