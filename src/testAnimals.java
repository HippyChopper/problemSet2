import javax.swing.*;
import java.awt.*;

public class testAnimals {

    public static void main(String[] args) {

        Animals tAnimals = new Animals();

        JTextArea textArea = new JTextArea(30,10);
        Font font = new Font("monospaced",Font.PLAIN,32);
        textArea.setFont(font);

        tAnimals.setType(tAnimals.getType());
        tAnimals.setContinents(tAnimals.getContinents());
        tAnimals.setAge(tAnimals.getAge());
        tAnimals.setWeight(tAnimals.getWeight());


        JOptionPane.showMessageDialog(null,tAnimals, "animals", JOptionPane.INFORMATION_MESSAGE);

    }
}
