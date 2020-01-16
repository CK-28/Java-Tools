/*Name: Crestena Khidhir
 *Date: 18/04/2017
 *Purpose: Finding Pythagreom Triplets for a given hypotenuse value
*/

//Required java libraries
import java.io.*;
import java.util.*;

public class Khidhir_codepythag
{
    public static void main (String[] args)
    {
        //Variable declaration
        int a = 0, b = 0, c = 0;                                                                               //a, b, and c are used to represent the three sides of a triangle
        int maxHypotenuse = -1;                                                                                     //Holds the maximun c/hypotenuse value the user wishes to go up to
        String test = "";

        Scanner kbscanner = new Scanner(System.in);

        //Welcome message
        System.out.println ("****************************************************************************");
        System.out.println ("                Welcome to the Pythagorean Triplets Machine!                ");
        System.out.println ("****************************************************************************");

        //Input
        System.out.print ("Please enter the maximum value of the hypotenuse and press <ENTER>: ");
        while (maxHypotenuse == -1)
        {
            test = kbscanner.nextLine ();

            //Tests for an integer by using the parseInt method from the Integer class and a NumberFormatException try catch statement
            try {
                maxHypotenuse = Integer.parseInt(test);
            } catch (NumberFormatException exception) {
                System.out.println("[Error] Not a Number.");
                System.out.print("Please input a valid response: ");
            }

            //Tests that the integer is not a zero
            if (maxHypotenuse < 1) {
                maxHypotenuse= -1;
                System.out.println("[ERROR] Integer must be a positive value ( > 0).");
                System.out.print("Please input a valid response: ");
            }
        }
        
        //Processing and Output
        System.out.println ("\nThe Pythagorean Theorem is a^2 + b^2 = c^2, where c is the hypotenuse.");       //Shows the user the meaning of the outputs as a guide
        System.out.println ("Here are the Pythagoren Triplets for the hypotenuse value you have chosen:");
        System.out.println ("\n(a, b, c)");
        
        for (a = 1; a < maxHypotenuse; a = a + 1)                                                              //As long as a is smaller than b the value of a will increase by 1 each time
        {
            for (b = 1; b < maxHypotenuse; b = b + 1)                                                          //As long as b is smaller than maxHypotenuse the value of a will increase by 1 each time
            {
                for (c = 1; c <= maxHypotenuse; c = c + 1)                                                     //As long as c is smaller than maxHypotenuse the value of a will increase by 1 each time
                {
                    if (Math.pow (a,2) + Math.pow (b,2) == Math.pow (c,2) && a < b && b < c)                   //if a^2 + b^2 = c^2 and a < b < c then the triplet creates a pythagorean pattern
                    {
                        System.out.println ("(" + a + ", " + b + ", " + c + ")");                              //Outputs the Pythagorean Pattern
                    }
                }
            }
        }

        kbscanner.close();
        
        //Goodbye message
        System.out.println ("\n*****************************************************************************");
        System.out.println ("                      Thank You For Using This Program!                      ");
        System.out.println ("*****************************************************************************");
    }//main method
}//Khidhir_codepythag class
