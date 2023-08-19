package strings_practice;

public class LappyOrNotOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =192384576,i=3,p=0,sum=0,y,z,count=0,u=0;
		String s =new String ("123456789");
		
//		char[] a=s.toCharArray();
//		for(y=0;y<a.length;y++) {
//			count=0;
//			for(z=y+1;z<a.length;z++) {
//				if(a[z]==a[y]) {
//					count++;
//				}
//			}
//			if(count==0) {
//				u++;
//			}
//			
//		}
//		if(u==9) {
//			System.out.println("lappy");
//		}
//		else
//			System.out.println("Not lappy");
		for(int x=49;x<=57;x++) {
			for(y=0;y<s.length();y++) {
				if((char)(x)==s.charAt(y)) {
					count++;
					break;
				}
			}
		}
		if(count==9) {
			System.out.println("Lappy");
		}
		else
			System.out.println("Not Lappy");
	}
	
}
