package using_comparable;
import java.util.*;
class Stud implements Comparable<Stud>
{
	int roll;
	String name;
	int marks;
	public Stud(int roll,String name,int marks)
	{
		super();
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Stud [roll=" + roll + ", name= "+ name + ", marks= " + marks + "]";
	}
	public int compareTo(Stud s) {
		return name.length()>s.name.length()?1:-1;
	}
	
}
public class ComparableInterface {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Stud> stud = new ArrayList<>();
		stud.add(new Stud(12,"Kohli",77));
		stud.add(new Stud(1,"Dhoni",99));
		stud.add(new Stud(33,"Rohit",55));
		stud.add(new Stud(99,"Virender",9));
		
		Collections.sort(stud,(i,j)->i.marks>j.marks?1:-1);
		for(Stud s:stud)
			System.out.println(s);
	}

}
