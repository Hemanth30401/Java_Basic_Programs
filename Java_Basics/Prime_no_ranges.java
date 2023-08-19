package javahub;

public class Prime_no_ranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=55, n=99,factor=0,sum=0,count=0;
		for(;x<=n;x++) {//55 start
			factor=0;
			for(int y=2;y<=x/2;y++) {
				if(x%y==0) {
					factor++;//11 is  prime but 12 onwards fact=1,so fact = 0;
					break;
				}
			}
			if(factor==0) {
				count++;
				sum = sum + x;
			}
			
		}
		System.out.println(count);
		System.out.println(sum);
	}
}
