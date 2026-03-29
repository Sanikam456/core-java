class MoviesRunner{
public static void main(String[] agrs)
{
	  Movies ref = new Movies("Love 360","Shashank",2019,9.8,140);
        ref.title = "Inception";
        ref.director = "Christopher Nolan";
        ref.releaseYear = 2010;
        ref.imdbRating = 8.8;
        ref.durationMinutes = 148;
        ref.getMoviesData();
    }
}