package movies;

public class Movie {
    private String name;
    private String category;

//    constructor
    public Movie (String movieName, String movieCategory) {
        this.name = movieName;
        this.category= movieCategory;
    }

    public String getName(){
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory (String category) {
        this.category = category;
    }

}
