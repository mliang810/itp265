
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String cardNumber;
    private String cvv;
    private double cardBalance;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String cardNumber, String cvv)
    {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.cardBalance = 0.00;
    }
    
    public Customer()
    {
        this("Default Name","0000000000000000","111");
    }
    
    public double getBalance(){
        return this.cardBalance;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setBalance(double balance){
        this.cardBalance += balance;
    }
}
