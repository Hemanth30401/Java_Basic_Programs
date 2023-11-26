package using_comparable;

import java.util.*;

public class ComparatorInterface {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>(Arrays.asList(205,404,509,478,101));
		
		l.sort(Comparator.reverseOrder());
		l.sort(Comparator.naturalOrder());
		System.out.println(l);
		Collections.sort(l,(i1,i2) -> i1%10>i2%10?1:-1);
		System.out.print("[");
		for(Integer t: l)
			System.out.print(t + " ");
		System.out.println("]");
	}

}
