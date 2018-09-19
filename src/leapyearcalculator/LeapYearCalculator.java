/*
 */
package leapyearcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jeffrey.herold
 */
public class LeapYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variable
        Scanner sc = new Scanner(System.in);
        String strChoice = "Y";
        int year = 0;
        
        //  Loop for user
        while (strChoice.equalsIgnoreCase("y"))
        {
        // Get user input
        try{
        System.out.print("Enter a year: ");   
        year = sc.nextInt();
         }catch (InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("Error! Invalid entry. Try again.\n");
                System.out.println();
                continue;
            }
        
        // Calculate if leap year
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
        //  Display results
        System.out.println("Year " + year + " is a leap year");
        }
        
        else
        System.out.println("Year " + year + " is not a leap year");{
        }
        
        // see if user wants to continue
            System.out.print("Continue? (y/n):  ");
            strChoice = sc.next();
            System.out.println();
        }
    }
}
