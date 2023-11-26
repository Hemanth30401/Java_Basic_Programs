package collections_class;
import java.util.*;
public class CollectionsAllMethodsLikeReverse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> l = new LinkedList<>(Arrays.asList(504,208,739,825,101));
		Object[] a = l.toArray();
		for(int i=0;i<a.length;i++)
		{
				int x=(int)a[i]%10;
		}
		for(Integer t:l)
			System.out.print(t + " ");
	}

}
