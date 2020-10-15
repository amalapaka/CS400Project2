// --== CS400 File Header Information ==--
// Name: Saul Brodkey
// Email: smbrodkey@wisc.edu
// Team: AD
// TA: Sophie Stephenson
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataWrangler {
	public static boolean load(RedBlackTree<Movie> movies)
	{
		try {
		Scanner in = new Scanner(new File("P2_movies.txt"));
		while(in.hasNext())
		{
			String t = in.nextLine();
			String d = in.nextLine();
			String g = in.nextLine();
			int r = in.nextInt();
			int as = in.nextInt();
			in.nextLine();//we need to call this
			String[]a = new String[as];
			for(int lcv = 0; lcv< as; lcv++)
			{
				a[lcv]= in.nextLine();
			}
			int y = in.nextInt();
			double ra = in.nextDouble();
			Movie n = new Movie(t,d,g,r,a,y,ra);
			//System.out.println(n.toString()+ " loaded in!"); Debugging line
			movies.insert(n);
		
			in.nextLine();//there's a space between entries
			in.nextLine();
		//	System.out.println("The tree reads: " + movies.toString()); Debugging line
		}
		return true;
		}
		catch(IOException e)
		{
			System.out.println("File not found!");
			return false;
		}
	}
}
