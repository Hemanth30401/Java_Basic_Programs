package javahub;
import java.util.Scanner;
public class Hospital_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital h = new Hospital();
		Scanner e = new Scanner(System.in);
		h.start();
		h.case1();
		h.calPatient();
		h.case2();
		h.calPatient2();
		h.case3();
		h.calPatient3();
	}

}
class Hospital{
	Scanner e = new Scanner(System.in);
	String accident1 = "1] Blood loss and brain damage";
	String accident2="2] Bone fracture";
	String accident3= "3] Sugar Problem";
	public void start() {
		System.out.println("Welcome to our hospital.How can I help you?");
		System.out.println();
	}
	
	public void case1() {
		System.out.println();
		String s = "Raman";
		char g = 'M';
		int age=35;
		System.out.println(s + " " + g + " " + age);
		System.out.println(accident1);
	}
	public void case2() {
		System.out.println();
		String a="Deepak";
		char g='M';
		int age=47;
		System.out.println(a + " " + g + " " + age);
		System.out.println(accident2);
	}
	public void case3() {
		System.out.println();
		String c3="Smriti";
		char g1='F';
		int age=39;
		System.out.println(c3 + " " + g1 + " " + age);
		System.out.println(accident3);
	}
	public void calPatient() {
		int sum=0,amb_fees=10000,fees=0,x=0;
		if(accident1.equals("1] Blood loss and brain damage")) {
			System.out.println();
			System.out.println("Surgeons we have:");
			System.out.println("1. Neuro surgeon");
			System.out.println("2. Orthopedic surgeon");
			System.out.println("3. Dentist");
			System.out.println("4. General Surgeon");
			System.out.println("5. Eye specialist");
			System.out.println();
			System.out.println("Specialist you need: ");
			
			String doc=e.nextLine();
			if(doc.equals("1. Neuro surgeon")) {
				System.out.println("Dr.Raina , Neuro specialist");
				System.out.println("Do you need ambulance: ");
				String acc = e.nextLine();
				if(acc.equals("yes")) {
					System.out.println("Need O+ group blood");
					System.out.println("Enter blood: ");
					
					String blood_group = e.nextLine();
					if(blood_group.equals("O+")) {
						System.out.println("He is safe but brain is severely injured");
						System.out.println("Call ASAP Doctor, need surgery.There is a chance");
				while(true) {
					System.out.println("Operation is: ");
					
					String surgery = e.nextLine();
					if(surgery.equals("Success")) {
						System.out.println("Patient is safe");
						fees=599900;
						System.out.println("Total Bill(including foreign doctors): " + fees +"(incl. GST)");
						break;
					}
					else if(surgery.equals("Partial")){
						System.out.println("Patient is critical, we need to concern foreign doctors");
						System.out.println("Foreign doctor needed? ");
						
						String foreign_doc = e.next();
						if(foreign_doc.equals("yes")) {
							fees=2099900;
							System.out.println("Total Bill(including foreign doctors): " + fees +"(incl. GST)");
						}
						else {
						fees=2099900;
						System.out.println("Fees(excluding foreign doctors): " + fees +"(incl. GST)");}
						break;
					}
					else {
						System.out.println("Patient is no more.Please donate organs. ");
						System.out.println("1. Heart");
						System.out.println("2. Eyes");
						System.out.println("3. Kidneys");
						System.out.println("4. or whole body");
						System.out.println("Donating: ");
						
						int org=e.nextInt();
						switch(org) {
						case 1:
							System.out.println("Thank you for giving Heart");
							x=150000;fees=1999000;
							System.out.println("We will give to your family of money " + x + " rupees.May the person is rest in peace");
							break;
						case 2:
							System.out.println("Thank you for giving Eyes");
							x=70000;fees=1999000;
							System.out.println("We will give to your family of money " + x + " rupees.May the person is rest in peace");
							break;
						case 3:
							System.out.println("Thank you for giving Kidneys");
							x=70000;fees=1999000;
							System.out.println("We will give to your family of money " + x + " rupees.May the person is rest in peace");
							break;
						case 4:
							System.out.println("Thank you for giving whole body");
							x=260000;fees=1999000;
							System.out.println("We will give to your family of money " + x + " rupees.May the person is rest in peace");
							break;
						default:
							fees=1999000;
						}
						System.out.println("Fees:(before donating) " + fees );
						fees=fees-x;
						System.out.println("Fees:(after donating) " + fees +"(incl. GST)");
					}
					sum=fees+amb_fees;
					System.out.println("Total Bill " + sum +"(incl. GST)");
					break;
					}
				}
			}
			else
				System.out.println("Invalid");
		}
			else
				System.out.println("Not needed");
			
			}
	}
	public void calPatient2() {
		int m=9990;
		System.out.println();
		if(accident2.equals("2] Bone fracture")) {
			System.out.println("Surgeons we have:");
			System.out.println("1. Neuro surgeon");
			System.out.println("2. Orthopedic surgeon");
			System.out.println("3. Dentist");
			System.out.println("4. General Surgeon");
			System.out.println("5. Eye specialist");
			System.out.println();
			System.out.println("Specialist you need: ");
			Scanner e = new Scanner(System.in);
			String doc=e.nextLine();
			if(doc.equals("2. Orthopedic surgeon")) {
				System.out.println("Dr.Ramesh,Ortho spec");
				System.out.println("Do you need appoinment: ");
				
				String appoin_req = e.nextLine();
				if(appoin_req.equals("yes")) {
			while(true) {
				System.out.println("Do you want ct_scan: ");
				Scanner s= new Scanner(System.in);
				String ct_scan = s.nextLine();
				if(ct_scan.equals("yes")) {
					System.out.println("Where in the body you got fracture: ");
					
					String body_part = e.nextLine();
					switch(body_part) {
						case "Leg":
							System.out.println("Leg is fixed");
							System.out.println("Fees:(including ct_scan) " + m + "(incl. GST)" );
							break;
						case "Left hand":
							System.out.println("Left hand is fixed");
							System.out.println("Fees:(including ct_scan) " + m + "(incl. GST)");
							break;
						default:
							System.out.println("Right hand is fixed");
							System.out.println("Fees:(including ct_scan) " + m + "(incl. GST)");
					}
					System.out.println("Need Support : ");
					
					String wheel = e.nextLine();
					if(wheel.equals("Wheelchair")) {
						int y1 = 14990,sum=0;
						sum=m+y1;
						System.out.println("Total Bill: " + sum + "(incl. GST)" );
					}
					else if(wheel.equals("Stick")){
						int m1= 1999,sum1=0;
						sum1=m+m1;
						System.out.println("Total Bill: " + sum1 + "(incl. GST)" );
					}
					else if(wheel.equals("Left Bandage")) {
						int q1=599,sum2=0;
						sum2=m+q1;
						System.out.println("Total Bill: " + sum2 + "(incl. GST)" );
					}
					else if(wheel.equals("Right Bandage")){
						int r1=599,sum3=0;
						sum3=r1+m;
						System.out.println("Total Bill: " + sum3 + "(incl. GST)" );
					}
					else {
						int sum4=m;
						System.out.println("Total Bill: " + sum4 + "(incl. GST)" );
					}
					break;
				}
				else
					System.out.println("We cannot do without ct scans");
				break;
			}
				}
			}
			else
				System.out.println("Not needed");
		}
		
	}
	public void calPatient3() {
		int bill=0;
		if(accident3.equals("3] Sugar Problem")) {
			System.out.println("Surgeons we have:");
			System.out.println("1. Neuro surgeon");
			System.out.println("2. Orthopedic surgeon");
			System.out.println("3. Endocrinologist");
			System.out.println("4. General Surgeon");
			System.out.println("5. Eye specialist");
			System.out.println();
			System.out.println("Specialist you need: ");
			Scanner e = new Scanner(System.in);
			String doc=e.nextLine();
			if(doc.equals("3. Endocrinologist")) {
				System.out.println("Your sugar level is: ");
				int sugar_level = e.nextInt();
				if(sugar_level>=90 && sugar_level<=140) {
					System.out.println("Normal(mg/dl)");
				}
				else if(sugar_level>140 && sugar_level<=199) {
					System.out.println("Mid Sugar level(mg/dl)");
					System.out.println("Eat vitamin foods like banana and do exercise");
				}
				else
				{
					System.out.println("High sugar level(mg/dl)");
					System.out.println("Excerise regularly, manage your carbs and stress.Get enough sleep");
				}
				bill=1000;
				System.out.println("Total Bill: " + bill + "(incl. GST)");
			}
			else
				System.out.println("Not needed that surgeon");
		}
	}
}
