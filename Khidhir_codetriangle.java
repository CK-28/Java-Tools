/*Name: Crestena Khidhir
 *Date: 21/03/2017
 *Purpose: Calculate the parimeter and area of area triangle using given lengths
*/

//Required Java libraries
import java.io.*;
import java.util.*;

public class Khidhir_codetriangle
{
    public static void main (String[] args)
    {
        //Variable declaration
        double side1 = -1, side2 = -1, side3 = -1, parimeter, area, temp;                          //side1, side2, and side3 symbolize the three sides of the triangle. parimeter is for parimeter. area is for Area. And temp is used in the equation.
        String test = "";
        Scanner kbscanner = new Scanner(System.in);
        
        //Welcome message
        System.out.println ("***********************************************************************");
        System.out.println ("                    Welcome to Triangle Calculator!                    ");
        System.out.println ("***********************************************************************");

        //Input
        System.out.print ("\nPlease enter side length 1 in cm and press <Enter>: ");
        while (side1 == -1)
        {
            test = kbscanner.nextLine();

            try {
                side1 = Integer.parseInt(test);
            } catch (NumberFormatException exception) {
                System.out.println("[ERROR] Not a Number.");
            }

            if (side1 <= 0) {
                side1 = -1;
                System.out.print("Please input a valid response: ");
            }
        }

        System.out.print ("Please enter side length 2 in cm and press <Enter>: ");
        while (side2 == -1)
        {
            test = kbscanner.nextLine();

            try {
                side2 = Integer.parseInt(test);
            } catch (NumberFormatException exception) {
                System.out.println("[ERROR] Not a Number.");
            }

            if (side2 <= 0) {
                side2 = -1;
                System.out.print("Please input a valid response: ");
            }
        }

        System.out.print ("Please enter side length 3 in cm and press <Enter>: ");
        while (side3 == -1)
        {
            test = kbscanner.nextLine();

            try {
                side3 = Integer.parseInt(test);
            } catch (NumberFormatException exception) {
                System.out.println("[ERROR] Not a Number.");
            }

            if (side3 <= 0) {
                side3 = -1;
                System.out.print("Please input a valid response: ");
            }
        }

        //Processing
        parimeter = side1 + side2 + side3;                                                         //Calculating Parimeter
        
        temp = parimeter / 2;
        
        area = Math.sqrt ( temp * (temp - side1) * (temp - side2) * (temp - side3));               //Calculating Area using Heron's Formula
        

        //Output
        System.out.println ("\nThe three sides lengths are:");
        System.out.println ((side1) + ("cm   ") + (side2) + ("cm   ") + (side3) + ("cm   "));
        System.out.println (("\nThe perimeter of the triangle is: ") + (parimeter) + ("cm"));
        System.out.println (("The area of the triangle is: ") + (area) + ("cm"));

        kbscanner.close();
        
        //Goodbye message
        System.out.println ("\n***********************************************************************");
        System.out.println ("                Thank you for using Triangle Calculator!               ");
        System.out.println ("***********************************************************************");
    }//main method
}//Khidhir_codetriangle class
