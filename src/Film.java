import javax.swing.*;

public class Film {

    private String title;
    private String director;
    private int duration;


    //no arguement

    public Film(){
        this.title ="title";
        this.director = "director";
        this.duration = 0;
    }

    public Film(String title, String director,int duration){
        setTitle(title);
        setDirector(director);
        setDuration(duration);
    }

    //getters

    public  String getTitle() {
    title = JOptionPane.showInputDialog(null,"enter title here");
        return title;
    }

    public String getDirector() {
        director = JOptionPane.showInputDialog(null,"enter director here");
        return director;
    }

    public int getDuration() {
        duration=Integer.parseInt( JOptionPane.showInputDialog(null,"enter duration here"));
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

        return "Film: " + title + "\nDirector: " + director + "\nDuration: " + duration + "mins";
    }
}

