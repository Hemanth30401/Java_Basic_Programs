package ArrayChapter4;

public class LinearSearchCommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = new int[] {15,144,12,1,21,87};
		int s = Integer.parseInt(args[0]);
		Ls l = new Ls();
		l.isLs(a, s);
	}

}
class Ls{
	public void isLs(int[] a,int s){
		int x;
		boolean b=false;
		for(x=0;x<a.length;x++) {
			if(a[x]==s) {
				b=true;
				break;
			}
		}
		if(b==true) {
			System.out.println("Element found");
		}
		else
			System.out.println("Element not found");
	}
}
