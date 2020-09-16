/**
*
* @author Michelle Liang
* ITP 265, Fall 2020, Tea Section
* 01 Week, Homework 1
* email: liangmic@usc.edu
* @version 08/20/20
*/
public class MyAnimation{
    public void drawFrame1(){
        System.out.println("              .:.");               
        System.out.println("             .::::.");             
        System.out.println("..         ..::::::::::");         
        System.out.println("::::..  .::''''':::    ''.");      
        System.out.println("':::::::'         '.  ..  '.");    
        System.out.println(" ::::::'            : '::   :");   
        System.out.println("  :::::     .        : ':'   :");  
        System.out.println("  :::::    :::       :.     .'."); 
        System.out.println(" .::::::    ':'     .' '.:::: :"); 
        System.out.println(" ::::::::.         .    ::::: :"); 
        System.out.println(":::::    '':.... ''      '''' :"); 
        System.out.println("':::: .:'              ...'' :"); 
        System.out.println(" ..::.   '.........:::::'   :"); 
        System.out.println("  '':::.   '::'':'':::'   .'");    
        System.out.println("        '..  ''.....'  ..'");      
        System.out.println("           ''........''");
    }
        
    public void drawFrame2(){
        System.out.println("              .:.");               
        System.out.println("             .::::.");             
        System.out.println("..         ..::::::::::");         
        System.out.println("::::..  .::''''':::    \"'.");      
        System.out.println("':::::::'         '.  ..  '.");    
        System.out.println(" ::::::'            : '     :");   
        System.out.println("  :::::              :-------:");  
        System.out.println("  :::::--------------:.     .'."); 
        System.out.println(" .::::::            .' '.:::: :"); 
        System.out.println(" ::::::::.         .    ::::: :"); 
        System.out.println(":::::    '':.... ''      '''' :"); 
        System.out.println("':::: .:'                    :"); 
        System.out.println(" ..::.   '.     ........:'   :"); 
        System.out.println("  '':::.   '::::::::::'   .'");    
        System.out.println("        '..            ..'");      
        System.out.println("           ''........''");
    }
        
    public void run(){
        drawFrame1();
        System.out.println("\n\n"); /**to slow down the output*/
        drawFrame2();
    }
        
    public void pause(){
        System.out.println("Paused...");
    }
        
    public static void main(String[] args){
        MyAnimation felix = new MyAnimation();
        felix.run();
    }
        
}
    


