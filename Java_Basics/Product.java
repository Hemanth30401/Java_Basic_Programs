package javahub;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What you want to buy?");
		Scanner s = new Scanner(System.in);
		String i = s.next();
		System.out.println("Choose " + i + " brand:");
		String b = s.next();
		System.out.println("Quantity: ");
		int quantity = s.nextInt();
		int price = 0,total=0,discount=0,final_total=0;
		System.out.println("Code: ");
		char code = s.next().charAt(0);
		
		switch(i) {
			case "AC":
				if(b.equals("Bluestar")) {
					price = 70000;
					code='B';
				}
				else if(b.equals("Whrilpool")) {
					price = 34490;
					code='W';
				}
				break;
			case "Fan":
				if(b.equals("Crompton")) {
					price = 1000;
					code='C';
				}
				else if(b.equals("orient")) {
					price = 1490;
					code='O';
				}
				break;
			case "Light":
				if(b.equals("Philips")) {
					price = 950;
					code='P';
				}
				else if(b.equals("Syska")) {
					price = 1199;
					code='S';
				}
				break;
			case "TV":
				if(b.equals("Samsung")) {
					price = 65000;
					code='S';
				}
				else if(b.equals("Sony")) {
					price = 79000;
					code='s';
				}
				break;
			case "Fridge":
				if(b.equals("Samsung")) {
					price = 45999;
					code='a';
				}
				else if(b.equals("LG")) {
					price = 61990;
					code='l';
				}
				break;
			default:
				System.out.println("Sorry that item we won't have");
		}
		total = price*quantity;
		System.out.println(i  + " item-> " + b + " brand, " + price + " rupees, " + quantity + "Q");
		System.out.println("Total Price: " + total);
		if(total>100000) {
			discount = 20*(total/100);
			final_total=total-discount;
		}
		System.out.println("Discount: " + discount);
		System.out.println("Final Price: " + final_total);
	}

}
