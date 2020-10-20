import java.util.Arrays;

// --== CS400 File Header Information ==--
// Name: Amulya Malapaka
// Email: amalapaka@wisc.edu
// Team: AD
// Role: Back End Developer 1
// TA: Sophie Stephenson
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
/**
 * Creates a movie object
 * @author amalapaka
 *
 */
public class Movie implements Comparable<Movie>{
	private RedBlackTree<Movie> movieOrganizer = new RedBlackTree();
	private String title;
	private String director;
	private String genre;
	private int runtime;
	private String[] act;
	private int year;
	private double ratings;
	
	//empty constructor
	public Movie() {
		title = "";
		director = "";
		genre = "";
		runtime = 0;
		this.act = new String[0];
		year = 0;
		ratings = 0.0;
	}
	//main constructor
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
	//getter methods
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public int getReleaseDate() {
		return year;
	}
	public int getRunTime() {
		return runtime;
	}
	public String getDirector() {
		return director;
	}
	public double getRatings() {
		return ratings;
	}
	public String getActors() {
		return Arrays.toString(this.act);
	}
	//setter methods
	public void setTitle(String title) {
		this.title = title.toLowerCase();
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setReleaseDate(int year) {
		this.year = year;
	}
	public void setRunTime(int runTime) {
		this.runtime = runTime;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public void setActors(String[] actors) {
		this.act = actors;
	}
	/**
	 * returns a string representation of all values saved in a movie object
	 * @return String - a string representation of all values saved in a movie object
	 */
	@Override
	public String toString()
	{
		return "Title: " + title + " \n Director: " + director + "\n Genre: " + genre + "\n Runtime: " + runtime
				+ "\n Release: " + year + "\n Actors" + Arrays.toString(act) + "\n Ratings: " + ratings;
	}
	/**
	 * helps us use the order to organize movies
	 * @return - -1 if the provided title comes earlier in the alphabet than the current movie object's title
	 * 				1 if the provided title comes later in the alphabet than the current movie object's title
	 * 				0 if the titles are both the same
	 */
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
