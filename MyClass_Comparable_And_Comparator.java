package using_comparable;
import java.util.*;
class MyComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Prod e1 = (Prod)o1;
		Prod e2 = (Prod)o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return -s1.compareTo(s2);
	}
}
public class MyClass_Comparable_And_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prod p1 = new Prod("Laptop",141);
		Prod p2 = new Prod("TV",233);
		Prod p3 = new Prod("Mobile",11);
		List<Prod> ProdList = new LinkedList<>();
		ProdList.add(p1);
		ProdList.add(p2);
		ProdList.add(p3);
		System.out.println(ProdList);
		Collections.sort(ProdList,new MyComparator());
		System.out.println(ProdList);
		for(int i=0;i<ProdList.size();i++)
			System.out.println(ProdList.get(i).getName());
	}
}
class Prod implements Comparable
{
	
	String name;
	int id;
	Prod(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return name+ " " + id;
	}
	@Override
	public int compareTo(Object o1) {
		int eid1=this.id;
		int eid2 = ((Prod)o1).id;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else 
			return 0;
	}
}