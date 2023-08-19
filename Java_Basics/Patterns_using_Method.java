package javahub;

public class Patterns_using_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p= new Pattern();
		p.calPatt();
	}

}
class Pattern{
	public void calPatt() {
		int x=0,s=0,y=0,z=0,a=0,b=0,c=0,d=0;
		for(x=1;x<=3;x++) {
			for(s=2;s>=x;s--) {
				System.out.print("  ");
			}
			for(y=1;y<=x;y++) {
				System.out.print("* ");
			}
			for(z=1;z<x;z++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(a=2;a<=3;a++) {
			for(b=1;b<a;b++) {
				System.out.print("  ");
			}
			for(c=3;c>=a;c--) {
				System.out.print("# ");
			}
			for(d=3;d>a;d--) {
				System.out.print("# ");
			}
			
			
			System.out.println();
		}
		
	}
}
