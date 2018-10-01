import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Book favBook = new Book();
        Scanner input = new Scanner(System.in);
        JTextArea textArea = new JTextArea(30, 10);
        Font font = new Font("Monospaced",Font.PLAIN, 12);

        favBook.setTitle(getFav());
        favBook.setPrice(getPrice());
        favBook.setIsbn(getISBN());
        favBook.setNumPages(getPages());

        Book leastFav = new Book();

        leastFav.setTitle(getleastFav());
        leastFav.setPrice(getPrice());
        leastFav.setIsbn(getISBN());
        leastFav.setNumPages(getPages());

        String text = "favorite book: \n"+ favBook + "\n\nleast favorite book is \n"+ leastFav;

        textArea.append(text);

        JOptionPane.showMessageDialog(null,text);


/*
       System out print test

       System.out.println("enter the Title.");
        favBook.setTitle(input.nextLine());
        System.out.println("enter the page number.");
        favBook.setNumPages(input.nextInt());
        System.out.println("enter the price.");
        favBook.setPrice(input.nextInt());
        System.out.println("enter the ISBN.");
        favBook.setIsbn(input.nextLine());

        System.out.println(favBook.getTitle());
        System.out.println(favBook.getNumPages());
        System.out.println(favBook.getIsbn());
        System.out.println(favBook.getPrice());
        System.out.println(favBook.toString());

*/

    } //public main close

    public static String getFav(){
        String favbook = JOptionPane.showInputDialog("What is your favorite book? ");
        return favbook;
    }

    public static String getleastFav(){
        String leastfavbook = JOptionPane.showInputDialog("What is your least favorite book? ");
        return leastfavbook;
    }

   public static Float getPrice(){
        String priceAsString = JOptionPane.showInputDialog("What is the price of the book? ");
        float price = Float.parseFloat(priceAsString);
        return  price;
    }
    public static String getISBN(){
        String ISBN = JOptionPane.showInputDialog("What is the isbn? ");

        while (ISBN.length() != 10 && ISBN.length()!= 13)
        {
          ISBN = JOptionPane.showInputDialog("Wrong! has to be between 10 and 13 characters, please renter ");
        }
        return ISBN;
    }
    public static int getPages(){

        String pageAsString = JOptionPane.showInputDialog("Please enter the number of pages ");
        for (int i =0; i<pageAsString.length();i++)
        {
            while ((!Character.isDigit(pageAsString.charAt(i)))){
                pageAsString = JOptionPane.showInputDialog("Invalid! please enter a digit ");
            }
        }
        int page = Integer.parseInt(pageAsString);
        return page;
    }


}
