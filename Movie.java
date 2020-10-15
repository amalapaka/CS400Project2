// --== CS400 File Header Information ==--
// Name: Saul Brodkey
// Email: smbrodkey@wisc.edu
// Team: AD
// TA: Sophie Stephenson
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
public class Movie implements Comparable<Movie>{
	private String title;
	private String director;
	private String genre;
	private int runtime;
	private String[] act;
	private int year;
	private double ratings;
	
	public Movie(String t, String d, String g, int rt, String[] act, int yr, double rating)
	{
		title = t;
		director = d;
		genre = g;
		runtime = rt;
		this.act = act;
		year = yr;
		ratings = rating;
	}
	public String getTitle()
	{
		return title;
	}
	@Override
	public String toString()
	{
		return getTitle();
	}
	@Override
	public int compareTo(Movie o){
		if(title.compareTo(o.getTitle())>0)
		{
			return 1;
		}
		if(title.compareTo(o.getTitle())<0)
		{
			return -1;
		}
		return 0;
	}
	
}
