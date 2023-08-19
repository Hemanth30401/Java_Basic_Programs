package javahub;
import java.util.Scanner;
public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n : ");
		Scanner s = new Scanner(System.in);
		int n = 145,temp=n,x=0,fact=1,y=0,sum=0;
		for(;n>0;n/=10) {
			fact=1;
			x=n%10;
			for(y=1;y<=x;y++) {
				fact = fact*y;
			}
			sum=sum+fact;
		
		}
		if(sum==temp)
			System.out.println(temp + " is a Strong number");
		else
			System.out.println(temp + " is not a Strong number");
	}

}
