package Arrays_Project;
import java.util.Arrays;
import java.util.Scanner;
public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S1 s = new S1();
		s.t1();
	}

}
class S1{
	Scanner sc = new Scanner(System.in);
	public void t1() {
		
		System.out.print("----------------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("| S.No|    Name    |   Roll No.   |  Age | Gender |  Branch  |    Year    |    CGPA    |");
		System.out.println();
		System.out.print("----------------------------------------------------------------------------------------");
		System.out.println();
		int[] Sno = new int[] {1,2,3,4,5,6,7,8,9};//s.no
		String[] Name = new String[] {"Naresh","Emilia","Nitish","Olivia","Preeti","Nithin","Sanjay","Akshya","Aadhya"};//names
		String[] RollNo = new String[] {"18B61A0493","18B61A0486","18B61A0465","18B61A0497","18B61A0458","18B61A0491","18B61A0492","18B61A0490","18B61A0453"};//roll
		int[] age = new int[] {18,19,19,20,20,21,21,18,18};//age
		char[] gender = new char[] {'M','F','M','F','F','M','M','F','F'};
		String[] branch = new String[] {"ECE","CSE","ECE","MEC","AIT","CSE","EEE","CIV","MEC"};
		String[] year = new String[] {"1st year","2rd year","2nd year","3rd year","3rd year","4th year","4th year","1st year","1st year"};
		double[] Cgpa = new double[] {7.11,7.37,8.56,9.35,8.14,7.01,6.99,9.74,7.77};
		int x,n=9,q,t,h2;
		char h3;
		String h,h1,h4,h5,l;
		for(x=0;x<n;x++) {
			System.out.print("|  " + Sno[x] + "  ");
			System.out.print("|   " + Name[x] + "   ");
			System.out.print("|  " + RollNo[x] + "  ");
			System.out.print("|  " + age[x] + "  ");
			System.out.print("|    " + gender[x] + "   ");
			System.out.print("|   " + branch[x] + "    ");
			System.out.print("|  " + year[x] + "  ");
			System.out.print("|    " + Cgpa[x] + "    |");
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("your choices: ");
		System.out.println("1. Insert Student to List");
		System.out.println("2. Sort Name or Rollno or age or branch or year or Cgpa");
		System.out.println("3. Remove Student from the list");
		System.out.println("Enter your choice ");
		q=sc.nextInt();
		switch(q) {
		case 1:
			System.out.println("Where do you want to insert student");
			System.out.println("Enter S.No: ");
			t=sc.nextInt();
			System.out.println("Enter name: ");
			h=sc.next();
			for(x=Name.length-1;x>t;x--) {
				Name[x]=Name[x-1];
			}
			Name[x]=h;
			
			System.out.println("Enter Roll No: ");
			h1=sc.next();
			for(x=RollNo.length-1;x>t;x--) {
				RollNo[x]=RollNo[x-1];
			}
			RollNo[x]=h1;
			System.out.println("Enter Age: ");
			h2=sc.nextInt();
			for(x=age.length-1;x>t;x--) {
				age[x]=age[x-1];
			}
			age[x]=h2;
			System.out.println("Enter Gender: ");
			h3=sc.next().charAt(0);
			for(x=gender.length-1;x>t;x--) {
				gender[x]=gender[x-1];
			}
			gender[x]=h3;
			System.out.println("Enter Branch: ");
			h4=sc.next();
			for(x=branch.length-1;x>t;x--) {
				branch[x]=branch[x-1];
			}
			branch[x]=h4;
			System.out.println("Enter Year: ");
			sc.nextLine();
			h5=sc.nextLine();
			for(x=year.length-1;x>t;x--) {
				year[x]=year[x-1];
			}
			year[x]=h5;
			System.out.println("Enter CGPA: ");
			double h6=sc.nextDouble();
			for(x=Cgpa.length-1;x>t;x--) {
				Cgpa[x]=Cgpa[x-1];
			}
			Cgpa[x]=h6;
			System.out.print("----------------------------------------------------------------------------------------");
			System.out.println();
			System.out.print("| S.No|    Name    |   Roll No.   |  Age | Gender |  Branch  |    Year    |    CGPA    |");
			System.out.println();
			System.out.print("----------------------------------------------------------------------------------------");
			System.out.println();
			for(x=0;x<n;x++) {
				System.out.print("|  " + Sno[x] + "  ");
				System.out.print("|   " + Name[x] + "   ");
				System.out.print("|  " + RollNo[x] + "  ");
				System.out.print("|  " + age[x] + "  ");
				System.out.print("|    " + gender[x] + "   ");
				System.out.print("|   " + branch[x] + "    ");
				System.out.print("|  " + year[x] + "  ");
				System.out.print("|    " + Cgpa[x] + "    |");
				System.out.println();
			}
			System.out.println("----------------------------------------------------------------------------------------");
		break;
	case 2:
		System.out.println("What you want to sort? ");
		l=sc.nextLine();
		l=sc.next();
		if(l.equals("Name")) {
			Arrays.sort(Name);
			for(x=0;x<Name.length;x++) {
				System.out.println(Name[x]);
			}
		}
		
		else if(l.equals("RollNo.")) {
			Arrays.sort(RollNo);
			for(x=0;x<RollNo.length;x++) {
				System.out.println(RollNo[x]);
			}
		}
		else if(l.equals("Age")) {
			Arrays.sort(age);
			for(x=0;x<age.length;x++) {
				System.out.println(age[x]);
			}
		}
		else if(l.equals("Gender")) {
			Arrays.sort(gender);
			for(x=0;x<gender.length;x++) {
				System.out.println(gender[x]);
			}
		}
		else if(l.equals("Branch")) {
			Arrays.sort(branch);
			for(x=0;x<branch.length;x++) {
				System.out.println(branch[x]);
			}
		}
		else if(l.equals("Year")) {
			Arrays.sort(year);
			for(x=0;x<year.length;x++) {
				System.out.println(year[x]);
			}
		}
		else if(l.equals("CGPA")) {
			Arrays.sort(Cgpa);
			for(x=0;x<Cgpa.length;x++) {
				System.out.println(Cgpa[x]);
			}
		}
		
		break;
		default:
			System.out.println("Invalid keyword");
	}
	
	}
}