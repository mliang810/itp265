import java.lang.*;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String title;
    private String author;
    private double price;
    private String format;
    private int numPages;

    /**
     * Constructor for objects of class Book
     */
   public Book(String title, String author, double price, String format, int numPages)
   {
        this.title = title;
        this.author = author;
        this.price = price;
        this.format = format;
        this.numPages = numPages;
   }
   
   public Book(String title, String author, int numPages){
       this(title, author, 9.99, "paperback", numPages);
   }

   public String getTitle(){
       return this.title;
    }
    
   public String getAuthor(){
       return this.author;
   }
   
   public double getPrice(){
       return this.price;
   }
   
   public void setPrice(){
       this.price = price;
   }
   
   public String getFormat(){
       return this.format;
   }
   
   public void setFormat(){
       this.format = format;
   }
   
   public int getNumPages(){
       return this.numPages;
   }
   
   public void setNumPages(){
       this.numPages = numPages;
   }
   
   public String toString(){
       String s = "\"" + title + "\" by " + author + " (" + format + " ;";
       s = s + (" " + numPages + " pages) $" + price);
       return s;
   }
   
   public boolean equals(Book diff){
       return (this.title.equalsIgnoreCase(diff.title)
       &&this.author.equalsIgnoreCase(diff.author)
       &&Math.abs(this.price-diff.price)<=0.0001
       &&this.format.equalsIgnoreCase(diff.format)
       &&this.numPages == diff.numPages);
   }
}
