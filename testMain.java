// --== CS400 File Header Information ==--
// Name: Saul Brodkey
// Email: smbrodkey@wisc.edu
// Team: AD
// TA: Sophie Stephenson
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
public class testMain {
	public static void main(String [] args)
	{
	RedBlackTree<Movie>netflix = new RedBlackTree<>();
	DataWrangler.load(netflix);
	System.out.println(netflix.toString()); 
	
	}
}
