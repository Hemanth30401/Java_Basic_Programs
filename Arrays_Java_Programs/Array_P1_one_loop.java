package ArrayChapter4;

public class Array_P1_one_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {10,15,30,20,19,17,54,99,77,125};
		int x,y,temp;
		for(x=0;x<a.length;x++) {
			for(y=x+2;y<a.length;y+=2) {
				if(y%2==0) {
					if(a[x]<a[y]) {
						temp=a[y];
						a[y]=a[x];
						a[x]=temp;
					}
				}
				else {
					if(a[x]>a[y]) {
						temp=a[y];
						a[y]=a[x];
						a[x]=temp;
					}
				}
			}
			
		}
		for(int t:a)
			System.out.print(t + " ");
	}

}
