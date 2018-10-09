import javax.swing.*;
import java.awt.*;

public class bikeTest {

    public static void main(String[] args) {
        JTextArea textArea = new JTextArea("text area \n");
        Font font = new Font("monospaced", Font.PLAIN, 10);
        textArea.setFont(font);

        Bicycle bike1 = new Bicycle();

        bike1.setName(bike1.getName());

    }

    public static String getName() {
        String name = JOptionPane.showInputDialog("Please enter a name");
        return name;
    }

    public static String getMake() {
        String make = JOptionPane.showInputDialog("Please enter a make");
        return make;

    }

    public static int getvalue() {
        int value = Integer.parseInt(JOptionPane.showInputDialog("Please enter a make"));
        return value;

    }
}