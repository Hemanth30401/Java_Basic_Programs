package ArrayChapter4;

public class TwoDarraysTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4,col=4,sum=0;
		int[][] a =new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{1,2,3,4}};
		for(int x=0;x<col;x++) {
			for(int y=0;y<rows;y++) {
					System.out.print(a[y][x] + " " );
			}
			System.out.println();
		}
		System.out.println();
		for(int x=0;x<rows;x++) {
			for(int y=0;y<col;y++) {
				sum=x+y;
				if(x==y || sum==rows-1)
					System.out.print(a[x][y] + " " );
			}
			System.out.println();
		}
	}

}
