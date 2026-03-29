class Movies {
    String title;
    String director;
    int releaseYear;
    double imdbRating;
    int durationMinutes;
    public Movies(String title,String director,int releaseYear,double imdbRating ,int durationMinutes) {
        System.out.println("I am the Movie constructor with parametar:"+title+","+director+","+releaseYear+","+imdbRating+","+durationMinutes);
    }
    public void getMoviesData() {
        System.out.println("----- Movie Information -----");
        System.out.println("Movie Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("IMDb Rating: " + imdbRating);
        System.out.println("Duration: " + durationMinutes);
    }
}
