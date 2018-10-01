public class Book {
    private String title;
    private int numPages;
    private String isbn;
    private double price;

    //accessor methods

    public String getTitle(){return title;}
    public int getNumPages(){return numPages;}
    public String getIsbn() {return isbn;}
    public double getPrice(){return price;}

    // mutator

    public void setTitle(String title){
        this.title = title;
    }

    public void setNumPages(int numPages){
        this.numPages = numPages;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //constructor

    public Book(){
        this.title = "Title";
        this.numPages = 0;
        this.isbn = "No ISBN";
        this.price = 0;
    }
        //second constructor which takes 4 arguments
        //representing the 4 attributes and calls the mutator methods directly.
    public Book(String titleEntry, int numPagesEntry, String isbnEntry, double priceEntry){

        // two ways of doing it. better off (for me) to use set and get. easier to remember

        /*
        this.title = titleEntry;
        this.numPages = numPagesEntry;
        this.isbn = isbnEntry;
        this.price =priceEntry;
        */

        setTitle(titleEntry);
        setIsbn(isbnEntry);
        setNumPages(numPagesEntry);
        setPrice(priceEntry);

    }
public String toString()
{
    return "Title: " + title + "\nISBN: "+ isbn+ "\nPrices: "+ price + "\nNumber of Pages: " + numPages;

}

}

