import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class GTM {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Welcome , Guess the movie Name....");
		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> c = new ArrayList<>();
		File files = new File("Albela.txt");
		Scanner s = new Scanner(files);
		while(s.hasNextLine()) {
			a.add(s.nextLine());
		}
		File file = new File("Govinda.txt");
		Scanner q = new Scanner(file);
		while(q.hasNextLine()) {
			c.add(q.nextLine());
		}
		char p;
		do {
		int m =new Random().nextInt(a.size());
		String mn= a.get(m);
		verify v = new verify();
		String x = v.spc(mn);
		
		
		System.out.println("Hint : Movie casts are : " + c.get(m));
		System.out.print("Guess the name   >>   ");
		System.out.println(x);
		//System.out.println(mn);
		int k =0;
		while (k <5) 
		{ if (x.toLowerCase().equals(mn.toLowerCase())== false) 
		{
			System.out.print(" guess an alphabet ::  ");
			Scanner o = new Scanner(System.in);
			p = o.next().charAt(0);
			String b =v.verfy(mn, p, x);
			System.out.println("   >>      " +b);
			
			if (x.equals(b)) 
			{
				k++;
				System.out.println("Ops , wrong guess : Chance left "+ (5-k));
				//System.out.println(x);
			}
			
			
			else 
			{
				x=b;
				if (x.toLowerCase().equals(mn.toLowerCase())== false) {
				System.out.println("correct guess..chance left "+(5-k) );
				}
			}}
		else {System.out.println("congrats ,you got it ..");
		break;}
		}
		if (k==5) {System.out.println("\nSorry you lost.. The movie is : "+ mn);}
		
		
		Scanner o = new Scanner(System.in);
		System.out.println("\ntype q to quit or y to play again :");
		 p = o.next().charAt(0);
		}while(Character.toLowerCase(p)=='y');

	}

}
