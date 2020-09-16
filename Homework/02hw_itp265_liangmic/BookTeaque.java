import java.util.*;
/**
 * @author Michelle Liang
 * @version Homework 2 
 * Gelato Section
 * liangmic@usc.edu
 * 
 */
public class BookTeaque
{
    // instance variables - replace the example below with your own
    private String storeName;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Beverage bev1;
    private Beverage bev2;
    private Beverage bev3;
    private String currentOrder;
    private Scanner sc;
    
    public BookTeaque()
    {
        this.storeName = "The Jasmine Dragon";
        book1 = new Book("Blue Period", "Tsubasa Yamaguchi", 12.99, "Paperback", 224);
        book2 = new Book("Metamorphosis", "Franz Kafka", 3.99, "Paperback", 44);
        book3 = new Book("Waiting for the Barbarians", "J.M. Coetzee", 14.28, "Paperback", 192);
        book4 = new Book("Beloved", "Toni Morrison", 27.00, "Hardcover", 316);
        book5 = new Book("Six of Crows", "Leigh Bardugo", 13.37, "Hardcover", 480);
        
        bev1 = new Beverage("Cheese Foam Jasmine Green Tea", 4.75);
        bev2 = new Beverage("Vietnamese Coffee", 4.50);
        bev3 = new Beverage("Guava White Tea", 3.90);
        
        currentOrder = "";
        sc = new Scanner(System.in);
    }
    
    public void printInventory(){
        System.out.println("Welcome to ITP 265 " + storeName + "! We are happy to have you here today!");
        System.out.println("ITP 265 " + storeName + " Inventory List");
        System.out.println("Our Books:");
        
        System.out.println("1. " + book1);
        System.out.println("2. " + book2);
        System.out.println("3. " + book3);
        System.out.println("4. " + book4);
        System.out.println("5. " + book5);
        
        System.out.println("\nOur Beverages:");
        System.out.println("1. " + bev1);
        System.out.println("2. " + bev2);
        System.out.println("3. " + bev3 + "\n");
    }
    
    public int inputInt(String prompt){
       System.out.println(prompt);
        while(sc.hasNextInt() == false){
            String garbage = sc.nextLine(); 
            System.out.println(garbage + " was not an integer.");
            System.out.println(prompt);
        }
        int i = sc.nextInt();
        sc.nextLine(); 
        return i;
    }
    
    public int inputInt(String prompt, int min, int max){
        int i = inputInt(prompt);
        while(i<min||i>max){
            System.out.println("That number is not valid. Input must be between " + min + " - " + max);
            i = inputInt(prompt);
        }
        return i;
    }
    
    public void shop(){
        printInventory();
        
        boolean keepGoing = true;
        while(keepGoing){
            System.out.println("Would you like to buy a book or a beverage or are you ready to checkout");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("book") || 
            choice.equalsIgnoreCase("beverage") ||
            choice.equalsIgnoreCase("checkout")){
                if(choice.equalsIgnoreCase("book")){
                    int bookchoice = inputInt("Which # book would you like to buy?", 1, 5);
                    switch(bookchoice){
                     case 1:
                        this.currentOrder+="book1";
                        System.out.println("Adding book1 to your order");
                        break;
                     case 2:
                        this.currentOrder+="book2";
                        System.out.println("Adding book2 to your order");
                        break;
                     case 3:
                        this.currentOrder+="book3";
                        System.out.println("Adding book3 to your order");
                        break;
                     case 4:
                        this.currentOrder+="book4";
                        System.out.println("Adding book4 to your order");
                        break;
                     case 5:
                        this.currentOrder+="book5";
                        System.out.println("Adding book5 to your order");
                        break;
                    }
                }
                if(choice.equalsIgnoreCase("beverage")){
                    int bevChoice = inputInt("Which # beverage would you like to buy?", 1, 3);
                    switch(bevChoice){
                     case 1:
                        this.currentOrder+="bev1";
                        System.out.println("Adding bev1 to your order");
                        break;
                     case 2:
                        this.currentOrder+="bev2";
                        System.out.println("Adding bev2 to your order");
                        break;
                     case 3:
                        this.currentOrder+="bev3";
                        System.out.println("Adding bev3 to your order");
                        break;
                    }
                }
                if(choice.equalsIgnoreCase("checkout")){
                    keepGoing = false;
                    if(currentOrder.equals("")){
                        currentOrder = "nothing";
                    }
                    else{
                        currentOrder = currentOrder.substring(0, currentOrder.length() - 5);
                    }   
                }
                
                if(keepGoing){
                    currentOrder+=" and ";
                }
            }
            else{
                System.out.println(choice + " not recognized as Book or Beverage or Checkout");
            }
        }
        //out of the shopping loop. Now to extract order from currentOrder
        System.out.println("Thanks for shopping at ITP 265 " + storeName);
        System.out.println("You bought " + currentOrder);

    }
    
    public static void main(String[] args){
	BookTeaque myStore = new BookTeaque();
	myStore.shop();
}
}
