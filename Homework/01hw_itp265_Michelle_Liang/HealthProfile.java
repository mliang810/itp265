import java.util.*;
import java.time.*;
public class HealthProfile
{
    private String firstName;
    private String lastName;
    private char gender;
    private int month;
    private int day;
    private int year;
    private double height;
    private double weight;
    private boolean covid;
    private String allergies;
    private String mentalHealth;
    private Scanner sc;
    
    public HealthProfile()
    {
        sc = new Scanner(System.in);
    }

    public void inputPatientInformation()
    {
        System.out.println("Please enter first name:");
        firstName = sc.nextLine();
        
        System.out.println("Please enter last name:");
        lastName = sc.nextLine();
        
        System.out.println("Please enter gender (M/F/O):");
        String genderString = sc.nextLine();
        gender = genderString.charAt(0);
        
        System.out.println("Please enter birth month (1-12):");
        month = sc.nextInt();
        
        System.out.println("Please enter birth day (1-31):");
        day = sc.nextInt();
        
        System.out.println("Please enter four digit birth year:");
        year = sc.nextInt();
        
        System.out.println("Please enter height in inches:");
        height = sc.nextDouble();
        
        System.out.println("Please enter weight in pounds:");
        weight = sc.nextDouble();
        
        System.out.println("Have you tested positive for COVID-19? (true/false):");
        covid = sc.nextBoolean();
        
        sc.nextLine();
        
        System.out.println("Please enter all allergies in a list:");
        allergies = sc.nextLine();
        
        System.out.println("Do you experience depression or depressive thoughts? Please describe if so.");
        mentalHealth = sc.nextLine();
    }
    
    public void printRecord()
    {
        System.out.println("***************************************************************************");
        System.out.println("\t\t\t\tHealth Profile");
        System.out.println("*Name: " + firstName + " " + lastName);
        System.out.println("*Gender: " + gender);
        System.out.println("*DOB: " + month + "\\" + day + "\\" + year);
        System.out.println("*Height: " + height + " inches");
        System.out.println("*Weight: " + weight + " pounds");
        
        int age = calculateAge();
        System.out.println("*Age: " + age);
        
        String heart = getTargetHeartRate();
        System.out.println("*❤️ Info: " + heart);
        
        System.out.println("*Allergies: " + allergies);
        System.out.println("*Mental Health: " + mentalHealth);
        
        if (covid == true){
            System.out.println("\n*ALERT: COVID POSITIVE");
        }
        else{
            System.out.println("\n*COVID Status: Negative");
        }
        System.out.println("***************************************************************************");
    }
    
    public int calculateAge()
    {
        LocalDate today = LocalDate.now();
        int monthToday = today.getMonthValue();
        int dayToday = today.getDayOfMonth();
        int yearToday = today.getYear();
        
        int yearCalc = yearToday - year;
        if (monthToday<=month){
            if (dayToday<=day){
                yearCalc = yearCalc - 1;
            }
        }
        return yearCalc;
    }
    
    public String getTargetHeartRate()
    {
        int age = calculateAge();
        double maxHeartRate = 220 - age;
        double lowerRange = maxHeartRate*0.5;
        double upperRange = maxHeartRate*0.85;
        
        String statement = "Maximum Heart Rate: " + maxHeartRate + " beats per minute.\n\t";
        statement = statement + "Target Heart Range: " + lowerRange + " – " + upperRange + " beats per minute.";
        
        return statement;
    }
    
    public double calculateBMI()
    {
        double bmi = (weight*703)/(height*height);
        return bmi;
    }
    
    public void displayBMIChart()
    {
        double bmi = calculateBMI();
        String category = "";
        
        if(bmi<18.5){
            category = "underweight";
        }
        
        if((18.5<=bmi) && (bmi<=24.9)){
            category = "normal";
        }
        
        if((25.0<=bmi)&&(bmi<=29.9)){
            category = "overweight";
        }
        
        if(bmi>=30){
            category = "obese";
        }
        
        System.out.println("BMI VALUES:");
        System.out.println("\tUnderweight: less than 18.5");
        System.out.println("\tNormal: between 18.5 and 24.9");
        System.out.println("\tOverweight: between 25 and 29.9");
        System.out.println("\tObese: 30 or greater");
        System.out.println("Your BMI is " + bmi + ", which puts you in the " + category + " category");
    }
    
    public static void main(String args[]) {
        HealthProfile record = new HealthProfile(); // same as right-click to make object
	record.inputPatientInformation(); //click on red box to call method
	record.printRecord(); // click on red box to call next method
	record.displayBMIChart();
    }
}
