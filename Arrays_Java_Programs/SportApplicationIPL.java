package Arrays_Project;
import java.util.Scanner;
import java.util.Arrays;

public class SportApplicationIPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPL I = new IPL();
		I.callTeams();
	}

}
class IPL{
	Scanner s=new Scanner(System.in);
	public void callTeams() {
		int a[]=new int [] {1,2,3,4,5,6,7,8,9,10};
		  String b[]=new String[] {"CSK-CHENNAI SUPER KINGS\t","DC-DELHI CAPITALS\t\t","GT-GUJARAT TITANS\t\t","LSG-LUCKNOW SUPER GIANTS\t","KKR-KOLKOTA KNIGHT RIDERS\t","MI-MUMBAI INDIANS\t\t","PBK-PUNJAB KINGS\t\t","RCB-ROYAL CHALLENGERS BANGALORE","RR-RAJASTHAN ROYALS\t\t","SRH-SUN RISERS HYDERABAD\t"};
		  while(true) {
		  
			  System.out.println("1)NAME OF THE TEAMS");
			  System.out.println("2)UPDATED POINTS TABLE");
			  System.out.println("3)STATS");
			  int x=s.nextInt();
			  switch(x)
			  {
			  	case 1:
			  		System.out.println("----------------------------------------------------------");
			  		System.out.println("|\t"+"SNO\t"+"|\t"+"TEAM NAME\t"+"\t\t |");
			  		System.out.println("----------------------------------------------------------");
			  		for(int y=0;y<a.length;y++)
			  		{
			  			System.out.println("|\t"+a[y]+"\t| "+" " +b[y]+" \t |");
			  		}
			  		System.out.println("----------------------------------------------------------");
		   
			  		while(true) {
			  			System.out.println("IF YOU WANT TO CHOOSE THE TEAM DETAILS");
			  			int sn=s.nextInt();
			  			switch(sn)
			  			{
			  			case 1:
			  				System.out.println("Captain       : Mahendra Singh Dhoni");
			  				System.out.println("Head Coach    : Stephen Fleming");
			  				System.out.println("IPL Title Won : 5 ");
			  				break;
			  			case 2:
			  				System.out.println("Captain       : Rishabh Pant");
			  				System.out.println("coach         : Ricky Pointing");
			  				System.out.println("IPL Title Won : 0");
			  				break;
			  			case 3:
			  				System.out.println("Captain       : Hardik Pandya");
			  				System.out.println("coach         : Ahish Nehra");
			  				System.out.println("IPL Title Won : 1 ");
			  				break; 
			  			case 4:
			  				System.out.println("Captain       : KL Rahul");
			  				System.out.println("coach         : Andy Flower");
			  				System.out.println("IPL Title Won : 0");
			  				break; 
			  			case 5:
			  				System.out.println("Captain       : Shreyas Iyer");
			  				System.out.println("coach         : Chandrakant Pant");
			  				System.out.println("IPL Title Won : 2 ");
			  				break;
			  			case 6:
			  				System.out.println("Captain       : Rohit Sharma");
			  				System.out.println("coach         : Mark Boucher");
		    				System.out.println("IPL Title Won : 5 ");
		    				break; 
		   				case 7:
		    				System.out.println("Captain       : Shikar Dhawan");
		    				System.out.println("coach         : Trevor Bayliss");
		    				System.out.println("IPL Title Won : 0 ");
		    				break;
		   				case 8:
		    				System.out.println("Captain       : Faf DuPlesiss");
		    				System.out.println("coach         : Sanjay Bangar");
		    				System.out.println("IPL Title Won : 0 ");
		    				break; 
		   				case 9:
		    				System.out.println("Captain       : Sanju Samson");
		    				System.out.println("coach         : Kumar Sangakkara");
		    				System.out.println("IPL Title Won : 1 ");
		    				break;
		   				case 10:
		    				System.out.println("Captain       : Aden Markram");
		    				System.out.println("coach         : Brain Lara");
		    				System.out.println("IPL Title Won : 2 ");
		    				break;
		   				default:
		    				break;			
			  			}
		   			if(sn==0)
			   			break;
		   		}
		   		break;
		  		case 2:
		   			callUpdated();
		   			break;
		  		case 3:
		  			callStats();
		  			break;
		   		default: 
			   			System.out.println("Invalid Input");
			  }
		  if(x>3)
		  break;
		  }
	}
	public void callUpdated() {
		System.out.print("---------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("| Rankings |     Team     |  Played  |   Won    |  Lost  | NoResult(NR) | NetRunRate(NRR) |Points |");
		System.out.println();
		System.out.print("---------------------------------------------------------------------------------------------------");
		System.out.println();
		int[] R = new int[] {1,2,3,4,5,6,7,8,9,10};
		String[] Team = new String[] {"RCB","CSK","SRH","MI","RR","GT","KKR","PBKS","DC","LSG"};
		int[] P = new int[] {14,14,14,14,14,14,14,14,14,14};
		int[] W = new int[] {10,8,8,8,7,7,6,6,5,4};
		int[] L = new int[] {4,5,5,6,7,7,8,8,9,10};
		int[] NR = new int[] {0,1,1,0,0,0,0,0,0,0};
		String[] NRR = new String[] {"+1.189","+0.652","+0.484","+0.212","+0.056","+0.148","-0.239","-0.207","-0.508","-0.703"};
		int[] Pts = new int[] {20,17,17,16,14,14,12,12,10,8};
		int x,n=10,y,temp,temp3,temp4,temp5,temp6,temp8;
		String temp2="";
		String temp7 ="";
		for(x=0;x<n;x++) {
			for(y=0;y<W.length-1;y++) {
				if(W[y]<W[y+1]) {
					temp=W[y];
					W[y]=W[y+1];
					W[y+1]=temp;
					y=-1;
				}
			}
			Arrays.sort(L);
			
			System.out.print("|    " + R[x] + "\t   |     " + Team[x] + "\t  |  " + P[x] + "\t     |   " + W[x] + "\t|   " + L[x] + "\t |    " + NR[x] + "         |    " + NRR[x] + "       |  " + Pts[x] + "\t  |");
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		while(true) {
		    System.out.println("What do you wanna do ?");
		    System.out.println("1)Want to see the rotation of the table ");
		    System.out.println("2) want to search the single team");
		    int sb=s.nextInt();
		    if(sb==1)
		    {
		    	System.out.println("How many Rotations");
		    	n=s.nextInt();int z1;
		    	for(int z=1;z<=n;z++)
		    	{
		    		temp=R[0];temp2=Team[0];temp3=P[0];temp4=W[0];temp5=L[0];temp7=NRR[0];temp6=NR[0];temp8=Pts[0];
		    		for(z1=0;z1<R.length-1;z1++)
		    		{
		    			R[z1]=R[z1+1]; 
		    			Team[z1]=Team[z1+1];
		    			P[z1]=P[z1+1];
		    			W[z1]=W[z1+1];
		    			L[z1]=L[z1+1];
		    			NR[z1]=NR[z1+1];
		    			NRR[z1]=NRR[z1+1];
		    			Pts[z1]=Pts[z1+1];
		      
		      
		    		}
		    		R[z1]=temp;
		    		Team[z1]=temp2;
		     		P[z1]=temp3;
		     		W[z1]=temp4;
		     		L[z1]=temp5;
		     		NR[z1]=temp6;
		     		NRR[z1]=temp7;
		     		Pts[z1]=temp8;
		     
		    	}
		    	System.out.print("---------------------------------------------------------------------------------------------------"); 
		     	System.out.println(); 
		     	System.out.print("| Rankings |     Team     |  Played  |   Won    |  Lost  | NoResult(NR) | NetRunRate(NRR) |Points |"); 
		     	System.out.println(); 
		     	System.out.print("---------------------------------------------------------------------------------------------------"); 
		     	System.out.println();

		     	for(x=0;x<R.length;x++) 
		     	{ 
		      
		     		// Arrays.sort(L); 
		       
		     		System.out.print("|    " + R[x] + "\t   |     " + Team[x] + "\t  |  " + P[x] + "\t     |   " + W[x] + "\t|   " + L[x] + "\t |    " + NR[x] + "         |    " + NRR[x] + "       |  " + Pts[x] + "\t  |"); 
		     		System.out.println(); 
		     	} 
		     	System.out.println("---------------------------------------------------------------------------------------------------"); 
		    
		    }
		    if(sb==2)
		    {

		      System.out.println("Enter the team name");
		      String search=s.next();
		      System.out.println("---------------------------------------------------------------------------------------------------"); 
		      System.out.println("| Rankings |     Team     |  Played  |   Won    |  Lost  | NoResult(NR) | NetRunRate(NRR) |Points |"); 
		      System.out.println(); 
		      System.out.println("---------------------------------------------------------------------------------------------------"); 
		      for(int z=0;z<R.length;z++)
		      {
		    	  if(search.equalsIgnoreCase(Team[z]))
		    	  {
		    		  System.out.println("|    " + R[z] + "\t   |     " + Team[z] + "\t  |  " + P[z] + "\t     |   " + W[z] + "\t|   " + L[z] + "\t |    " + NR[z] + "         |    " + NRR[z] + "       |  " + Pts[z] + "\t  |");  
		    	  }
		      }
		      System.out.println("---------------------------------------------------------------------------------------------------"); 
		     
		    }
		    if(sb>2)
		    {
		     break;
		    }
		   }
		    
	}
	
	public void callStats() {
		while(true) {
			System.out.println("1. Most Runs");
			System.out.println("2. Most Wickets");
			System.out.println("3. Most Sixes");
			System.out.println("4. Highest Score");
			int cs = s.nextInt();
			switch(cs) {
			case 1:
				int[] P = new int[] {1,2,3,4,5,6};
				String[] s = new String[] {"Shubhman Gill(GT)\t","Faf du Plessis(RCB) ","Virat Kohli(RCB)\t","Deven Conway(CSK)\t","David Warner(DC)\t","Yashasvi Jaiswal(RR)"};
				int[] I =new int[] {14,14,14,14,14,14};
				int[] R = new int[] {890,845,811,790,750,730,719};
				double[] A =new double[R.length];
				int n=6,x=0;
				for(int y=0;y<R.length;y++) {
					for(int z=y;z<I.length;z++) {
						A[x++]=R[y]/I[z];
						break;
					}
				}
				System.out.print("-----------------------------------------------------------------------------");
				System.out.println();
				System.out.print("| Position |  \t\tName\t\t  |  Innings |   Runs   |  Average  |");
				System.out.println();
				System.out.print("-----------------------------------------------------------------------------");
				System.out.println();
				for(x=0;x<n;x++) {
					System.out.print("|    " + P[x] + "\t   | " + s[x] + "\t  |    " + I[x] + "    |   " + R[x] + "\t|   " + A[x] + "    |   ");
					System.out.println();
				}
				System.out.println("-----------------------------------------------------------------------------");
				break;
			case 2:
				int[] P1 = new int[] {1,2,3,4,5,6};
				String[] s1 = new String[] {"Mohammed Siraj(RCB)","Rashid Khan(GT)","Ravindra Jadeja(CSK)","Arshdeep Singh(PBKS)","Akash Madhwal(MI)","Mohit Sharma(GT)"};
				int[] I1 =new int[] {14,14,14,14,14,14};
				int[] W1 = new int[] {31,28,25,22,21,20};
				int n1=6;
				System.out.print("---------------------------------------------------------------------\t");
				System.out.println();
				System.out.print("| Position |      \tName\t          |  Innings  |   Wickets   |");
				System.out.println();
				System.out.print("---------------------------------------------------------------------\t");
				System.out.println();
				for(x=0;x<n1;x++) {
					System.out.print("|    " + P1[x] + "\t   |     " + s1[x] + "\t  |    " + I1[x] + "     |     " + W1[x] + "\t    |   ");
					System.out.println();
				}
				System.out.println("---------------------------------------------------------------------\t");
				break;
			case 3:
				int[] P2 = new int[] {1,2,3,4,5,6};
				String[] s2 = new String[] {"F D Plessis(RCB)","Shivam Dube(CSK)","Shubhman Gill(GT)","Glenn Maxwell(RCB)","Rutraj Gaikwad(CSK)","Rinku Singh(KKR)"};
				int[] I2 =new int[] {14,14,14,14,14,14};
				int[] Si2 = new int[] {36,35,33,31,30,29};
				int n2=6;
				System.out.print("---------------------------------------------------------------------\t");
				System.out.println();
				System.out.print("| Position |     \tName\t          |  Innings  |  Most Sixes |");
				System.out.println();
				System.out.print("---------------------------------------------------------------------\t");
				System.out.println();
				for(x=0;x<n2;x++) {
					System.out.print("|    "+ P2[x] + "\t   |     " +  s2[x] + "\t  |    " + I2[x] +"     |     " + Si2[x] + "\t    |   ");
					System.out.println();
				}
				System.out.println("---------------------------------------------------------------------\t");
				break;
			case 4:
				int[] P3 = new int[] {1,2,3,4,5,6};
				String[] s3 = new String[] {"S Gill(GT)\t","Y Jaiswal(RR)\t","Henrich Klassen(SRH)","Virat Kohli(RCB)","Suryakumar Yadav(MI)","Cameron Green(MI)"};
				int[] I3 =new int[] {14,14,14,14,14,14};
				int[] H3 = new int[] {129,124,104,101,100,98};
				int n3=6;
				System.out.print("---------------------------------------------------------------------\t");
				System.out.println();
				System.out.print("| Position |     \tName\t        |  Innings  | Highest Score |");
				System.out.println();
				System.out.print("---------------------------------------------------------------------\t");
				System.out.println();
				for(x=0;x<n3;x++) {
					System.out.print("|    " + P3[x] + "\t   |     " + s3[x] + "\t|    " + I3[x] + "     |     " + H3[x] + "\t    |");
					System.out.println();
				}
				System.out.println("---------------------------------------------------------------------\t");
				break;
			default:
				System.out.println("Invalid Input");
			}
			if(cs>4)
				break;
		}
		
	}
}