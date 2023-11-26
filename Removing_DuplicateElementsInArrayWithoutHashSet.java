package collection_interface;
import java.util.*;

public class Removing_DuplicateElementsInArrayWithoutHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Hello All Good Morning";
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		for(int x=0;x<s.length();x++)
			al1.add(s.charAt(x));
		for(int x=0;x<al1.size();x++) 
		{
			if(!al2.contains(al1.get(x)))
			{
				al2.add(al1.get(x));
			}
		}
		System.out.println(al2);
	}

}
