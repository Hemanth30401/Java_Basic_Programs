package mapsHierarchy;
import java.util.*;
public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<String, Integer> m = new TreeMap<>();
		m.put("Hemanth", 34);
		m.put("Sohel", 2);
		m.put("Laxman", 1);
		m.put("Jaswanth", 3);
		m.put("Akash", 4);
		System.out.println(m.values());
		System.out.println(m.keySet());
		System.out.println(m.containsKey("Hemanth"));
		System.out.println(m.entrySet());
		System.out.println(m.firstKey());
		for(int x=1;x<m.size();x++)
			System.out.println(m.lastKey());
		System.out.println(m.headMap("Laxman"));
		System.out.println(m.tailMap("Hemanth"));

		System.out.println(m.lastEntry());
		System.out.println(m.firstEntry());
		System.out.println(m.floorKey("Hemanth"));
		System.out.println(m.lowerKey("Sohel"));
		System.out.println(m.lowerEntry("Sohel"));
		System.out.println(m.higherKey("Hemanth"));
		System.out.println(m.higherEntry("Hemanth"));
		System.out.println();
		Map<String,String> map=new Hashtable<>();
		map.put("myname", "Sai");
		map.put("God of Cricket", "Sachin");
		map.put("CEO", "Elon");
		map.put("CEO", "Sai");
		
//		System.out.println(map.get("CEO"));
		Set<String> s = map.keySet();
		for(String t:s)
			System.out.println(t + " " + map.get(t));
		
		
	}

}
