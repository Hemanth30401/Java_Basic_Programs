package javahub;
import java.util.Scanner;
public class Patterns_Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int r=3;
		for(int x=1;x<=r;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		for(int z=r-1;z>0;z--) {
			for(int q=1;q<=z;q++) {
				System.out.print(q + " ");
			}
			System.out.println();
		}
		for(int x=1;x<=r;x++) {
			for(int y=x;y>0;y--) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
		int a=0,b=1,c=0,n=10;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for(int x=0;x<=n;x++) {
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(c + " ");
		}*/
//		String s = new String("Hello All Good Morning Hello");
//		String[]a = s.split(" ");
//		int count=0;
//		for(int x=0;x<a.length;x++) {
//			count=0;
//			for(int y=x+1;y<a.length;y++) {
//				if(a[x].equals(a[y])) {
//					count++;
//				}
//			}
//			if(count==1) {
//				System.out.print(a[x] + " ");
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Month: ");
//		int x=sc.nextInt();
//		if(x==1 || x==3 || x==5 || x==7||x==8|| x==10||x==12) {
//			System.out.println("31 days");
//		}
//		else if(x==4|| x==6|| x==9||x==11) {
//			System.out.println("30 days");
//		}
//		else
//			System.out.println("28 days");
		
//		String s = new String("Hello all good morning");
//		char[] a = s.toCharArray();
//		boolean[] b = new boolean[a.length];
//		int count=1;
//		for(int x=0;x<a.length;x++) {
//			if(a[x]!=' ') {
//				if(b[x]==true)
//					continue;
//				count=1;
//				for(int y=x+1;y<a.length;y++) {
//					if(a[x]==a[y])
//					{
//						count++;
//						b[y]=true;
//					}
//				}
//				if(count>=1)
//				System.out.println(a[x] + " " + count);
//			}
//			
//		}
		
		
//		String s1 = "Hello hello all good morning all".toLowerCase();
//		String[] s2 = s1.split(" ");
//		boolean[] b = new boolean[s2.length];
//		int count1=1;
//		for(int x=0;x<s2.length;x++)
//		{
//			if(s2[x]!=" ")
//			{
//				if(b[x]==true)
//					continue;
//				count1=1;
//				for(int y=x+1;y<s2.length;y++) {
//					if(s2[x].equals(s2[y])) {
//						count1++;
//						b[y]=true;
//					}
//				}
//			}
//			System.out.println(s2[x] + " " + count1);
//		}
		int r=4;
		for(int x=1;x<=r;x++)
		{
			for(int sq=r;sq>x;sq--)
				System.out.print("  ");
			for(int y=1;y<=x;y++)
				System.out.print(y*y + " ");
			for(int z=x-1;z>=1;z--)
				System.out.print(z*z + " ");
			System.out.println();
		}
		for(int z=r-1;z>0;z--)
		{
			for(int sq=r;sq>z;sq--)
				System.out.print("  ");
			for(int q=1;q<=z;q++)
				System.out.print(q*q + " ");
			for(int f=z-1;f>=1;f--)
				System.out.print(f*f + " ");
			System.out.println();
		}
		
	}
}
