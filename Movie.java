public class Movie{

    private String name;
    private String genre;
    private double rating;  //out of 10
    private int year;
    private int duration;  //in minutes

    public Movie(String n, String g, double r, int y, int d){
        name = n;
        genre = g;
        rating = r;
        year = y;
        duration = d;
    }

    public String toString(){

        return("Movie: " + movie + "\nGenre: " + genre + "\nRating: " + rating + "\nYear: " + year + "\nDuration: " + duration + 
        "\n\n");
        )
    }

}