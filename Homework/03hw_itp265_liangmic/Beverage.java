import java.lang.*;
/**
 * Write a description of class Beverage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Beverage
{
    // instance variables - replace the example below with your own
    private String name;
    private double price;

    /**
     * Constructor for objects of class Beverage
     */
    public Beverage(String name, double price)
    {
        this.name = name;
        this.price = price;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public boolean equals(Beverage diff){
        return (this.name.equalsIgnoreCase(diff.name)&&(Math.abs(this.price-diff.price)<=0.0001));
    }
    
    public String toString(){
        String s = "Beverage: " + name + " , $" + price;
        return s;
    }
}
