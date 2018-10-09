import javax.swing.*;

public class Film {

    private String title;
    private String director;
    private int duration;
    private int count = 2;


    //no arguement

    public Film(){
        this.title ="title";
        this.director = "director";
        this.duration = 0;
        this.count = 2;
    }

    public Film(String title, String director,int duration){
        setTitle(title);
        setDirector(director);
        setDuration(duration);

    }

    //getters


    public int getCount() {
        return count;
    }

    public  String getTitle() {

        return title;
    }

    public String getDirector() {

        return director;
    }

    public int getDuration() {

        return duration;
    }

    //setters


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {

        return "Film: " + title + "\nDirector: " + director + "\nDuration: " + duration + "mins\n";
    }
}

