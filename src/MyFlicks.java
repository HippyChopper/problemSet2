import javax.swing.*;
import java.awt.*;

public class MyFlicks {

    public static void main(String[] args) {

       String numAsString = JOptionPane.showInputDialog(null,"enter num");
        int i = Integer.parseInt(numAsString) -1;
     
        Film[] film1 = new Film[i];

        film1[0] =new Film();
        film1[1] =new Film();
        film1[2] =new Film();

        display(film1);

    }

    public static void display(Film[] film1){
        JTextArea textArea= new JTextArea("Film: \n\n");
        Font font = new Font("monospaced",Font.ITALIC,16);
        textArea.setFont(font);
        for (int i = 0;i<=2;i++){
            textArea.append("title: " + film1[i].getTitle() + "\n");
            textArea.append("director: " + film1[i].getDirector() + "\n");
            textArea.append("Duration: " + film1[i].getDuration() + "\n");
        }
        JOptionPane.showInputDialog(null,textArea);
    }
}
