package mapsHierarchy;
import java.util.*;

public class UniqueWordsInAStringUsingLinkedHaspMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hellohi";
		char ch[] = s.toCharArray();
		Map<Character, Integer> m = new HashMap<>();
		for(Character ch1:ch)
		{
			if(m.containsKey(m))
				m.put(ch1, m.get(ch1)+1);
			else
				m.put(ch1, 1);
		}
		Set<Character> set1 = m.keySet();
		for(Character ch2:set1)
		{
			System.out.println(ch2);
		}
		System.out.println(m);
	}

}
