
package transferadvisor;

/**
 *
 * @author Joseph Sanger 1527317
 * 
 * This program takes in the users school name, users major and users GPA.  
 * It then lets you know if you have sufficient GPA or need to improve. If a 
 * school or major is not in the program, it lets the user know.
 */

//scanner import
import java.util.Scanner;

public class TransferAdvisor {
    //function to intake parameters and displays output to avoid repeating code
    //this function will run if the school and major are in the system
    //it then lets the user know if the GPA is high enough
    public static void displayResult(String school, String major, double minGPA, double currGPA){
        if(currGPA >= minGPA)
            System.out.println("You could transfer to "+ school + " to study " + major);
        else{
            double diff = minGPA - currGPA;
            System.out.printf("You need to improve your GPA by %.2f to transfer to %s to study %s", diff, school, major);
}
}    
   
public static void main(String[] args) {
//new scanner       
    Scanner scan = new Scanner(System.in);
//declare variables    
    String school, major;
    double minGPA, currGPA;
//gather information from user    
System.out.print("Enter the school name: ");
    school = scan.next();
System.out.print("Enter the major: ");
    major = scan.next();
System.out.print("Enter your GPA: ");
    currGPA = scan.nextDouble();

//start of switch statements, Uses a switch for the school, then uses a switch
//inside the school name for the major. if the school or major are not in the
//system then it defaults to a message letting the user know. If the school
//and major are in the system, it calls the function above to mesure the GPA
//the users input is changed to UpperCase to match the casename
switch(school.toUpperCase()){
    case "UCLA":
        switch(major.toUpperCase()){
            case "CS":
                displayResult(school, major, 3.7, currGPA);
                break;
            case "ECON":
                displayResult(school, major, 3.5, currGPA);
                break;
            case "ENGLISH":
                displayResult(school, major, 3.2, currGPA);
                break;
            default:
                System.out.println("There is no " + major + " major at " + school);}
                break;
    case "UCB":
        switch(major.toUpperCase()){
            case "CS":
                displayResult(school, major, 3.8, currGPA);
                break;
            case "ECON":
                displayResult(school, major, 3.4, currGPA);
                break;
            case "ENGLISH":
                displayResult(school, major, 3.3, currGPA);
                break;
            default:
                System.out.println("There is no " + major + " major at " + school);}
                break;
    case "UCI":
        switch(major.toUpperCase()){
            case "CS":
                displayResult(school, major, 3.6, currGPA);
                break;
            case "ECON":
                displayResult(school, major, 3.7, currGPA);
                break;
            case "ENGLISH":
                displayResult(school, major, 3.4, currGPA);
                break;
            default:
                System.out.println("There is no " + major + " major at " + school);}
                break;
    case "UCSD":
        switch(major.toUpperCase()){
            case "CS":
                displayResult(school, major, 3.5, currGPA);
                break;
            case "ECON":
                displayResult(school, major, 3.3, currGPA);
                break;
            case "ENGLISH":
                displayResult(school, major, 3.0, currGPA);
                break;
            default:
                System.out.println("There is no " + major + " major at " + school);}
                break;
            default:
                System.out.println(school + " is not in the school system.");}
}
}