package javahub;
import java.util.*;
public class Range_Count_Of_Perfect_Square_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),s=0,count=0;
		double a=0;
		for(int x=1;x<=n;x++)
		{
			s=x;
			a=Math.sqrt(s);
			if(a==(int)a)
				count++;
		}
		System.out.println(count);
		
//		double n=12;
//		if(n==(int)n)
//			System.out.println("Bye");
	}

}
