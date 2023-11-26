package collection_interface;
import java.util.*;
public class CopyList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<>(Arrays.asList(1,2,4,5,7,9,11));
		System.out.println(l);
		LinkedList<Integer> l1 = new LinkedList<>(l);
		System.out.println(l1);
		
//		int r=5,k=2,count=0;
//		for(int i=1;i<=r;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				count=0;
//				for(int z=2;z<=k/2;z++)
//				{
//					if(k%z==0) {
//						count++;break;}
//				}
//				if(count==0)
//					System.out.print(k + " ");
//				else
//					j--;
//				k++;
//			}
//			System.out.println();
//				
//		}
//		
	}

}
