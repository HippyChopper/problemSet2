import javax.swing.*;
import java.awt.*;

public class testMessage {
    public static void main(String[] args) {
        Message email = new Message();
     //   Message sender = new Message();
        JTextArea textArea = new JTextArea(30,10);
        Font font = new Font("monospaced", Font.PLAIN,12);

        email.setRecipient(email.getRecipient());
        email.setSender(email.getSender());
        email.setMessage(email.getMessage());
        email.setAppend(email.getAppend());

        JOptionPane.showMessageDialog(null,email);

    }

  /* public static String getRecipient()
    {
        String recipient = JOptionPane.showInputDialog("What is this the recipient name ");
        return recipient;
    }

    public static String getSender()
    {
        String sender = JOptionPane.showInputDialog("What is the Senders name? ");
        return sender;
    }

    public static String getMessage()
    {
        String message = JOptionPane.showInputDialog("Enter your message ");
        return message;
    }

    public static String getAppend() {

           String append = "\n add on appendment";
        return append;
    }*/
}
