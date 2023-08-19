package ArrayChapter4;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=2,col=4;
		int [][]a=new int[][] {{1,2,3,4},{5,6,7,8}};
		int [][]b=new int[][] {{1,2,3,4},{5,6,7,8}};
		int [][]c=new int[4][4];
		for(int x=0;x<rows;x++) {
			for(int y=0;y<col;y++) {
				c[x][y]=a[x][y]+b[x][y];
			}
		}
		for(int x=0;x<rows;x++) {
			for(int y=0;y<col;y++) {
				System.out.print(c[x][y] +" " );
			}
			System.out.println();
		}
	}

}
