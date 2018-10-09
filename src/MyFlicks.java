import javax.swing.*;
import java.awt.*;

public class MyFlicks {

    public static void main(String[] args) {

       //String numAsString = JOptionPane.showInputDialog(null,"enter num");
        //int i = Integer.parseInt(numAsString) -1;

        Film film1 = new Film();
        int count = 0;
        count =film1.getCount();
        Film[] catalog = new Film[count];

        for (int i = 0; i<catalog.length;i++) {
           String title = JOptionPane.showInputDialog(null, "enter title here");
           String director = JOptionPane.showInputDialog(null, "enter director here");
            int duration = Integer.parseInt(JOptionPane.showInputDialog(null, "enter duration here"));

            catalog[i] = new Film(title,director,duration);
            //film1[0] =new Film(title,director,duration);
            //film1[1] =new Film(title,director,duration);
            //film1[2] =new Film(title,director,duration);
        }

        display(catalog);

    }


    public static void display(Film[] catalog){
        JTextArea textArea= new JTextArea("Film: \n\n");
        Font font = new Font("monospaced",Font.ITALIC,16);
        textArea.setFont(font);
        String text = "";
        for (Film f: catalog){

            text+= f.toString();
            textArea.append(text);
            //textArea.append("director: " + film1[i].getDirector() + "\n");
            //textArea.append("Duration: " + film1[i].getDuration() + " Mins\n");
        }
        JOptionPane.showInputDialog(null,text);
    }
}
