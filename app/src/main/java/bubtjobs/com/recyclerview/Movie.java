package bubtjobs.com.recyclerview;

/**
 * Created by Murtuza on 3/11/2016.
 */
public class Movie {
    private String title,genre,year;
    public Movie(){}

    public Movie(String title,String genre,String year){
        this.title=title;
        this.genre=genre;
        this.year=year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
