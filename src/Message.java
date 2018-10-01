import javax.swing.*;

public class Message {
    private String recipient;
    private String sender;
    private String message;
    private String append;


    //getters
   public String getRecipient(){

       String recipient = JOptionPane.showInputDialog("What is this the recipient name ");
       return recipient;
   }
    public String  getSender()
    {
        String sender = JOptionPane.showInputDialog("What is the Senders name? ");
        return sender;
    }
    public String getMessage()
    {
        String message = JOptionPane.showInputDialog("Enter your message ");
        return  message;
    }
    public String getAppend()
    {
        String append = "\n add on appended";
        return append;
    }


    //setters

    public void setRecipient(String recipient)
    {
        this.recipient = recipient;
    }

    public void setSender(String sender)
    {
        this.sender = sender;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
    public void setAppend(String append)
    {
        this.append = append;
    }


    // constructer
    public Message(){
        this.recipient = "recipient";
        this.sender = "sender";

    }



    public String toString()
    {
        return "From: " + sender + "\n To : " + recipient + "\n Message: " + message  + append;
    }


}
