class Movie {
    static String theatreName = "Mandya Sanjaya Theatre";
    String title;
    String director;
    String genre;
    int durationMinutes;
    double rating;
	
	public Movie(){
	}
    public Movie(String title, String director, String genre, int durationMinutes, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.durationMinutes = durationMinutes;
        this.rating = rating;
        
    }
    public void displayMovieDetails() {
        System.out.println("Theatre:"+theatreName);
        System.out.println("Title:"+title);
        System.out.println("Director:"+director);
        System.out.println("Genre:"+genre);
        System.out.println("DurationMinutes:"+durationMinutes);
        System.out.println("Rating :"+rating);
    }
}