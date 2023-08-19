package Array_Chapter1;

public class Max_Min_ele_in_A_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = new int[] {11,5,77,8888,3223,11};
		int x,max=0;

		for(x=0;x<d.length-1;x++) {
			if(d[x+1]<d[x])
			{
				max=x;
				
				
			}
			
		}
		System.out.print(max + " ");
		
	}

}
