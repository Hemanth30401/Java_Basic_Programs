package javahub;

public class Twin_primes_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3,count=0,f=0,l=0;
		for(;x<=5;x++) {
			count=0;
			f=x;//1
			l=x+2;//3
			for(int y=1;y<=f;y++) {
				if(f%y==0) {
					count++;
				}
			}
			if(count==2) {
				count=0;
				for(int z=1;z<=l;z++) {
					if(l%z==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.println(f + " " + l);
				}
			}
		}
	}

}
