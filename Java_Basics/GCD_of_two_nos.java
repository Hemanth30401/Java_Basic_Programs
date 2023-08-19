package javahub;

public class GCD_of_two_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=20,z,d=0;
		for(z=1;z<=x && z<=y ;z++) {
			if(x%z==0 && y%z==0) {
				d=z;
			}
		}
		System.out.println(d);
	}

}
