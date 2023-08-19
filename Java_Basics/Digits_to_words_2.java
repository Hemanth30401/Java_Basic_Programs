package javahub;

public class Digits_to_words_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =15200,rev=0,digit1=0,Prev=0,digit2=0,New=0,x;
		while(n>0) {
			rev=rev*10+n%10;
			n/=10;
			digit1++;//5
		}
		for(;rev>0;rev/=10) {
			Prev=rev%10;//1,5,5,2
			New=(rev/10)%10;//5,5,2,0
			
			switch(Prev) {
				case 1:
					if(Prev==New)
						System.out.print(" Double ");
					else
						System.out.print(" One ");
					break;
				case 2:
					if(Prev==New)
						System.out.print(" Double ");
					else
						System.out.print(" Two ");
					break;
				case 3:
					if(Prev==New)
						System.out.print(" Double ");
					else
						System.out.print(" Three ");
					break;
				case 4:
					if(Prev==New)
						System.out.print(" Double ");
					else
						System.out.print(" Four ");
					break;
				case 5:
					if(Prev==New)
						System.out.print(" Double ");
					else
						System.out.print(" Five ");
					break;
				case 6:
					if(Prev==New)
						System.out.print(" Double ");
					else
						System.out.print(" Six ");
					break;
				case 7:
					if(Prev==New)
						System.out.print(" Double ");
					else
						System.out.print(" Seven ");
					break;
				case 8:
					if(Prev==New)
						System.out.print(" Double ");
					else
						System.out.print(" Eight ");
					break;
				case 9:
					if(Prev==New)
						System.out.print(" Double ");
					else
						System.out.print(" Nine ");
					break;
				default:
					System.out.print(" Zero");
				}
			digit2++;//4
		}
		digit1=digit1-digit2;
		for(x=1;x<=digit1;x++) {
			System.out.println("Double zero");
			break;
		}
	}
}
